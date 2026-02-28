package com.oop.project.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryItem {
	Book book1 = new Book("When the coffee gets cold", "01");
	Book book2 = new Book("Never Lie", "02");
	Book book3 = new Book("Frankenstein", "03");
	
	public List<Book> books = new ArrayList<>();
	
	
	public LibraryItem() {
		super();
		books.add(book1);
		books.add(book2);
		books.add(book3);
	}
	public List<Book>  getBooks() {
		return books;
	}
	public List<Book> addBook(Book book){
		books.add(book);
		return books;
	}
}
