package com.hig.todolist.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.hig.todolist.dto.Member;

@Repository
public class RegisterDao  extends HibernateDaoSupport {
	@Autowired
	public RegisterDao(SessionFactory sf) {
		super.setSessionFactory(sf);
	}
	
	public void register(Member member) {
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		
		session.beginTransaction();
		
		session.save(member);
		
		session.getTransaction().commit();
	}
}
