package com.practice.book;
import com.practice.author.*;
public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public void show() {
		author.show();
		System.out.println(name + " " + qty + " " + price);
	}
	
	
}
