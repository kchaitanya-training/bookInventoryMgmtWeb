package com.takeo.service;

import java.util.List;

import com.takeo.dao.BookDao;
import com.takeo.model.Book;

public class BookService {
	
	BookDao bookDao;
 
	public BookService() {
		bookDao=new BookDao();
	}
	
	public void addBook(Book book) {
		bookDao.addBook(book);
	}
	
	public List<Book> redBooks(){
		
		return null;
	}
}
