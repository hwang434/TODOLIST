package com.hig.todolist.dao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.hig.todolist.dto.Diary;
import com.hig.todolist.dto.Member;

@Repository
public class LoginDao extends HibernateDaoSupport {
	@Autowired
	public LoginDao(SessionFactory sf) {
		super.setSessionFactory(sf);
	}
	
	public void save(Diary diary) {
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		
		session.beginTransaction();
		
		session.save(diary);
		
		session.getTransaction().commit();
	}

	public boolean select(Member member) {
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Query q = session.createQuery("from member "+"where member.email = :email and password = :password");
		q.setParameter("email", member.getEmail());
		q.setParameter("password", member.getPassword());
		
		if (q.uniqueResult() == null) {
			System.out.println("q.uniqueResult == null");
			return false;
		}
		
		return true;
	}
	
}
