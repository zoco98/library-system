package com.oop.project.service;

import java.util.List;

import com.oop.project.model.Book;
import com.oop.project.model.LibraryItem;

//inheritance
//abstraction
//polymorphism
//interfaces
//encapsulation
//collections
//exception handling

public class LibraryService {
	LibraryItem lItem = new LibraryItem();
	public boolean checkBookAvl(String bName) {
		for (Book b : lItem.getBooks()) {
			if(b.getBookName().equals(bName)) {
				return true;
			}
		}
		return false;
	}

	public void addbook(String bName, String author) {
		Book book = new Book();
		book.setBookId(bName.charAt(0)+author.substring(0,1));
		book.setBookName(bName);
		book.setAuthor(author);
		List<Book> allBook = lItem.addBook(book);
		for (Book b: allBook) {
			System.out.println(b.getBookName());
		}
	}
}
