package com.dic04.v1;

public class Book {
	String isbn;
	String title;

	public Book(String isbn, String title) {
		this.isbn = isbn;
		this.title = title;
	}

	@Override
	public boolean equals(Object o) throws RuntimeException {
		return true;
	}

//	public boolean equals(Book o) {
//		return true;
//	}

//	public int equals(Book b) {
//		return b.isbn.compareTo(this.isbn);
//	}

	public static void main(String[] args) {
		Object b1 = new Book("1111", "Thinking in Java");
		Object b2 = new Book("9999", "Java in 24 hrs");
		System.out.println(b1.equals(b2)); // true
	}
}
