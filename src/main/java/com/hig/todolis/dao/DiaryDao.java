package com.hig.todolis.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class DiaryDao extends HibernateDaoSupport {
	
	@Autowired
	public DiaryDao(SessionFactory sf) {
		super.setSessionFactory(sf);
	}
}
