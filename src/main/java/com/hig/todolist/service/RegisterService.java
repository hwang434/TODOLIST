package com.hig.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hig.todolist.dao.RegisterDao;
import com.hig.todolist.dto.Member;

@Service
public class RegisterService {
	@Autowired
	RegisterDao rDao;
	
	public void register(Member member) {
		rDao.register(member);
	}

}
