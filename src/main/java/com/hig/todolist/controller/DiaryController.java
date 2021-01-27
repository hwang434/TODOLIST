package com.hig.todolist.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hig.todolist.dto.Diary;
import com.hig.todolist.dto.Member;
import com.hig.todolist.service.DiaryService;

@Controller
public class DiaryController {
	@Autowired
	DiaryService dService;
	private static Logger logger = LoggerFactory.getLogger(Diary.class);
	
	@RequestMapping(value="/writeFrm", method = RequestMethod.GET)
	public String writeFrm() {
		logger.info("[DiaryController] : /writeFrm");
		return "writeFrm";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(@RequestParam("title") String title, @RequestParam("content") String content, HttpSession session) {
		Member member = (Member)session.getAttribute("member");
		Diary diary = new Diary();
		diary.setTitle(title);
		diary.setContent(content);
		diary.setMember(member);
		
		logger.info("[DiaryController] : /write\n"+"requet : "+diary);
		
		dService.writeDiary(diary);
		
		return "redirect:/home";
	}
	
	@RequestMapping(value= "/board", method = RequestMethod.GET)
	public String boardList(HttpSession session) {
		Member member = (Member)session.getAttribute("member");
		
		
		return "board";
	}
}
