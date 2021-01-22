package com.hig.todolist.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.hig.todolist.dto.Diary;

@Repository
public class DiaryDao extends HibernateDaoSupport {
	
	@Autowired
	public DiaryDao(SessionFactory sf) {
		super.setSessionFactory(sf);
	}

	public void save(Diary diary) {
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		
		session.beginTransaction();
		
		session.save(diary);
		
		session.getTransaction().commit();
	}
}
