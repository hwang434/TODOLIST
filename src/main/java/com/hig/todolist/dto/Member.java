package com.hig.todolist.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "member")
@Table(name = "member")
public class Member {
	@Id
	private String email;                                                                    
	private String password;                                                                 
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)                                           
	private List<Diary> diaryList = new ArrayList<Diary>();                          
	                                                                                 
	public List<Diary> getDiaryList() {                                              
		return diaryList;                                                            
	}                                                                                
	public void setDiaryList(List<Diary> diaryList) {                                
		this.diaryList = diaryList;                                                  
	}                                                                                
	public String getEmail() {                                                       
		return email;                                                                
	}                                                                                
	public void setEmail(String email) {                                             
		this.email = email;                                                          
	}                                                                                
	public String getPassword() {                                                    
		return password;                                                             
	}                                                                                
	public void setPassword(String password) {                                       
		this.password = password;                                                    
	}                                                                                
	@Override                                                                        
	public String toString() {                                                       
		return "Member [email=" + email + ", password=" + password + "]";            
	}
}
