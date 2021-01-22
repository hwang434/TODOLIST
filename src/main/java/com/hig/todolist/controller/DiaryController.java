package com.hig.todolist.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hig.todolist.dto.Diary;
import com.hig.todolist.service.DiaryService;

@Controller
public class DiaryController {
	@Autowired
	DiaryService dService;
	
	@RequestMapping(value="/writeFrm", method = RequestMethod.GET)
	public String writeFrm() {
		System.out.println("ddd");
		return "writeFrm";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		Diary diary = new Diary();
		diary.setTitle("title");
		diary.setContent("content");
		diary.setDno(1);
		diary.setComplete(true);
		dService.writeDiary(diary);
		
		return "home";
	}
}
