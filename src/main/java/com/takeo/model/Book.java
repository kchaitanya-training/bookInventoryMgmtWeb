package com.takeo.model;

public class Book {
	
	private int bookId;
	
	private String bookName;
	
	private String category;
	
	private double price;
	
	private String bookDescription;
	
	java.sql.Date date;
	
	private String availability;
	
	
	
	
	public Book(String bookName, String category, double price,
			String bookDescription) {

		this.bookName = bookName;
		this.category = category;
		this.price = price;
		this.bookDescription = bookDescription;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public java.sql.Date getDate() {
		return date;
	}

	public void setDate(java.sql.Date date) {
		this.date = date;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
