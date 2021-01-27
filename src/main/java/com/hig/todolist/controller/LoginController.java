package com.hig.todolist.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hig.todolist.dto.Member;
import com.hig.todolist.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService lService;
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(@RequestParam(value="email", required=true) String email, 
						@RequestParam(value="password", required=true) String password, 
						@ModelAttribute("member") Member member, 
						HttpSession session, 
						HttpServletRequest request) {
		logger.info("/write\n"+"requet : "+member);
		
		session = request.getSession();
		
		if (lService.login(member)) {
			logger.info("member is exist.");
			session.setAttribute("login", true);
			session.setAttribute("member",member);
		} else {
			logger.info("member is not exist.");
			session.setAttribute("login", false);
		};
		
		return "redirect:home";
	}
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:home";
	}
}
