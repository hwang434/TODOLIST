package com.hig.todolist.controller;

import java.util.Locale;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hig.todolist.dao.DiaryDao;
import com.hig.todolist.dto.Diary;
import com.hig.todolist.service.DiaryService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	DiaryService dService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = {"/", "home"}, method = RequestMethod.GET)
	public String home() { 
		logger.info("[HomeController] : /, home");
		
		return "home";
	}
}
