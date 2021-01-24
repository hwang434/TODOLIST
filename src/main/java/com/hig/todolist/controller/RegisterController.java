package com.hig.todolist.controller;

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
	
	
	@RequestMapping(value="/registerFrm", method = RequestMethod.GET)
	public String registerFrm() {
		System.out.println("[RegisterController] : registerFrm");
		return "registerFrm";
	}
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String register(@RequestParam("email") String email, @RequestParam("password") String password) {
		System.out.println("[RegisterController] : register");
		Member member = new Member();
		member.setEmail(email);
		member.setPassword(password);
		
		rService.register(member);
		
		return "home";
	}
}
