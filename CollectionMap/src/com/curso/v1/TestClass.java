package com.curso.v1;

import java.util.*;

class Book {
	
	private String title, isbn;
	
	@Override
	public boolean equals(Object o) {
		boolean res = false;
		res = (o instanceof Book &&
			  ((Book)o).isbn.equals(this.isbn));
		
		return res;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}

class BookStore{
	
	//Map<Book,Integer> map = new HashMap<>(); //A partir Java7
	Map<Book,Integer> map = new HashMap<Book,Integer>();
	
	int getNumberOfCopies(Book b) {
		return map.get(b); 
	}
	
	public void addBook(Book b, int numberofcopies) {
		map.put(b,numberofcopies);
	}
	
	// other methods

}

public class TestClass {
	
	static BookStore bs = new BookStore();
	
	public static void main(String[] args) {
		
		Book b = new Book();
		b.setIsbn("111");
		bs.addBook(b, 10);
		
		System.out.println(bs.getNumberOfCopies(b)); //10
		
		b = new Book();
		b.setIsbn("222");
		
		System.out.println(bs.getNumberOfCopies(b)); //10

	}

}
