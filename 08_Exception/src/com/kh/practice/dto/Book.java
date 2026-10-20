package com.kh.practice.dto;

public class Book {
	
	// Field //
	private String title;
	private String writer;
	private String date;
	private String content;
	
	// Constructor //
	public Book() {
		super();
	}

	public Book(String title, String writer, String date) {
		super();
		this.title = title;
		this.writer = writer;
		this.date = date;
		
	}
	// Method //
	public void setName(String title) {
		this.title = title;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public String getDate() {
		return date;
	}

	public String getContent() {
		return content;
	}
	public String info() {
		return "책 정보 - 이름: " + title + " | 저자: " + writer + " | 읽은 날짜: " + date;
		
	}
	
	
}

