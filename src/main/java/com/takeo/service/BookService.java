package com.takeo.service;

import com.takeo.dao.AddBookDao;
import com.takeo.model.Book;

public class BookService {
	
	AddBookDao addBookDao;
 
	public BookService() {
		 addBookDao=new AddBookDao();
	}
	
	public void addBook(Book book) {
		addBookDao.addBook(book);
	}
}
