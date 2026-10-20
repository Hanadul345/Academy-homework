package com.kh.practice;

import com.kh.practice.dto.Book;

public class BookReportController {
	
	Book[] books = new Book[99];
	public void saveTheBook(String title, String writer, String date) {
	
	for(int i = 0; i < books.length; i++) {
		if(books[i] == null ) {
			books[i] = title;
			return;
		}
	}
		
	}
	public void loadTheBook() {
		
	}
		
}
