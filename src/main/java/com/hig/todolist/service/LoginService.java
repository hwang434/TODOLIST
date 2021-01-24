package com.hig.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hig.todolist.dao.LoginDao;
import com.hig.todolist.dto.Member;

@Service
public class LoginService {
	@Autowired
	LoginDao lDao;
	
	public boolean login(Member member) {
		return lDao.select(member);
	}
}
