package com.hig.todolist.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hig.todolist.dto.Diary;
import com.hig.todolist.dto.Member;

@Repository
@Transactional
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
		System.out.println("select");
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		
		session.beginTransaction();
		
		String select = "from member m where m.email=:email and m.password=:password";
		
		Query q = session.createQuery(select);
		q.setParameter("email", member.getEmail());
		q.setParameter("password", member.getPassword());
		
		//if the member isn't exist return false. else return true.
		if (q.uniqueResult() == null) {
			return false;
		}
		
		return true;
	}
	
}
