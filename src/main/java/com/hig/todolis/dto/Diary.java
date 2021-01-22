package com.hig.todolis.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Diary {
	@Id
	private int dno;
	private String title;
	private String content;
	private boolean isComplete;

}
