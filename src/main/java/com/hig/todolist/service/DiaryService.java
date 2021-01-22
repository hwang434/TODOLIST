package com.hig.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hig.todolist.dao.DiaryDao;
import com.hig.todolist.dto.Diary;

@Service
public class DiaryService {
	@Autowired
	DiaryDao dDao;
	
	public boolean registDiary(Diary diary) {
		return false;
	}

	public void writeDiary(Diary diary) {
		dDao.save(diary);
	}
}
