package com.hig.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hig.todolist.dto.Member;
import com.hig.todolist.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService lService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(@RequestParam(value="email", required=true) String email, @RequestParam(value="password", required=true) String password) {
		Member member = new Member();
		member.setEmail(email);
		member.setPassword(password);
		
		boolean isExist = lService.login(member);
		
		return null;
	}
}
