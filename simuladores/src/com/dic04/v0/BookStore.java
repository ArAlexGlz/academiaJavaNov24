package com.dic04.v0;

import java.util.*;

class Book {
	private String isbn;

	public Book(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public int hashCode() {
		//return Objects.hashCode(isbn); //MAS OPTIMO
		//return super.hashCode(); //NO FUNCIONA
		return 100;
	}

	@Override
	public boolean equals(Object o) {
		return (o instanceof Book && ((Book) o).isbn.equals(this.isbn));
	} // ... setters and getters

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + "]";
	}
}

public class BookStore {

	Map<Book, Integer> map = new HashMap<Book, Integer>();

	public BookStore() {
		Book b = new Book("A111");
		map.put(b, 10);
		b = new Book("B222");
		map.put(b, 5);
//		b = new Book("A111");
//		map.put(b, 8);
	}

	Integer getNumberOfCopies(Book b) {
		return map.get(b);
	}

	public static void main(String[] args) {
		//System.out.println(new BookStore().map);
		BookStore bs = new BookStore();         
		Book b = new Book("A111"); 
		System.out.println(bs.getNumberOfCopies(b)); 
		
	}

}
