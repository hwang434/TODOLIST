package com.hig.todolis.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Diary {
	private int dno;
	private String title;
	private String content;
	private boolean isComplete;

}
