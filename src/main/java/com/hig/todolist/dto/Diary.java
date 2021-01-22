package com.hig.todolist.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "diary")
public class Diary {
	@Id
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
