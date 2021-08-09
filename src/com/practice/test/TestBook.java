package com.practice.test;

import com.practice.author.Author;
import com.practice.book.Book;

public class TestBook {
	public static void main(String[] args) {
		Book book = new Book("Hello", new Author("Sahil", "sahil@email.com", 'M'), 150);
		book.show();
		book.setPrice(125);
		book.show();
		book.setQty(4);
		book.show();
	}
}
