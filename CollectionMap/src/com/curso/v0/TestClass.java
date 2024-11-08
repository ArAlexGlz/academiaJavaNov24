package com.curso.v0;

class Book {
	
	private String title, isbn;
	
	@Override
	public boolean equals(Object o) {
		boolean res = false;
		res = (o instanceof Book &&
			  ((Book)o).isbn.equals(this.isbn));
		
		return res;
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

public class TestClass {
	
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("Book A");
		b1.setIsbn("XYZ");
		
		Book b2 = new Book();
		b2.setTitle("Book B");
		b2.setIsbn("WTH");
		
		Book b3 = new Book();
		b3.setTitle("Book C");
		b3.setIsbn("XYZ");
		
		Book b4 = b1;
		
		System.out.println("b1.equals(b2): "+b1.equals(b2)); //
		System.out.println("b3.equals(b1): "+b3.equals(b1)); //true
		System.out.println("b4.equals(b1): "+b4.equals(b1)); //true

	}

}
