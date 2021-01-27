package com.hig.todolist.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hig.todolist.dto.Member;
import com.hig.todolist.service.RegisterService;

@Controller
public class RegisterController {
	@Autowired
	RegisterService rService;
	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
	
	@RequestMapping(value="/registerFrm", method = RequestMethod.GET)
	public String registerFrm() {
		logger.info("[RegisterController] : /registerFrm");
		return "registerFrm";
	}
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String register(@RequestParam("email") String email, @RequestParam("password") String password) {
		Member member = new Member();
		member.setEmail(email);
		member.setPassword(password);
		
		logger.info("[RegisterController] : /register\n"+"requet : "+member);
		
		rService.register(member);
		
		return "redirect:/home";
	}
}
