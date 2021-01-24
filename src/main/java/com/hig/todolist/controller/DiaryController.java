package com.hig.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hig.todolist.dto.Diary;
import com.hig.todolist.service.DiaryService;

@Controller
public class DiaryController {
	@Autowired
	DiaryService dService;
	
	@RequestMapping(value="/writeFrm", method = RequestMethod.GET)
	public String writeFrm() {
		System.out.println("[DisplayController] : writeFrm");
		return "writeFrm";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(@RequestParam("title") String title, @RequestParam("content") String content) {
		System.out.println("[DisplayController] : write");
		Diary diary = new Diary();
		diary.setTitle(title);
		diary.setContent(content);
		
		dService.writeDiary(diary);
		
		return "redirect:/home";
	}
}
