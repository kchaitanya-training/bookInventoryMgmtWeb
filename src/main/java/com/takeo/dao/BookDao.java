package com.takeo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.takeo.model.Book;
import com.takeo.util.DBConnection;

public class BookDao {

	public void addBook(Book book) {
		PreparedStatement ps = null;
		Connection con = null;
		try {

			con = DBConnection.getConnection();
			ps = con.prepareStatement("SELECT MAX(BOOK_ID) FROM bookinventory");
			ResultSet rs = ps.executeQuery();
			int maxId = 0;
			while (rs.next()) {
				maxId = rs.getInt(1);
			}

			ps = con.prepareStatement("insert into bookinventory(BOOK_ID,BOOK_NAME,BOOK_PRICE) values" + "(?,?,?)");// Insert
																													// query
			ps.setInt(1, ++maxId);
			ps.setString(2, book.getBookName());

			ps.setDouble(3, book.getPrice());

			ps.execute();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Book> readBooks() throws ClassNotFoundException, SQLException {
		PreparedStatement ps = null;
		Connection con = null;
		con = DBConnection.getConnection();
		ps = con.prepareStatement("SELECT * FROM bookinventory");
		ResultSet rs = ps.executeQuery();
		List<Book> listBooks = new ArrayList();
		
		while (rs.next()) {
			
			
			Book book = new Book();
			
			int id = rs.getInt(1);
			String bookname = rs.getString(2);
			Double price = rs.getDouble(4);
			book.setBookId(id);
			book.setBookName(bookname);
			book.setPrice(price);
			
			listBooks.add(book);

		}

		return listBooks;
	}

}
