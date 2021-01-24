package com.hig.todolist.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "diary")
public class Diary {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dno;
	private String title;
	private String content;
	private boolean isComplete;
	public int getDno() {
		return dno;
	}
	@Override
	public String toString() {
		return "Diary [dno=" + dno + ", title=" + title + ", content=" + content + ", isComplete=" + isComplete + "]";
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

}
