package com.celcom.day5;

import java.util.ArrayList;

class Book{
	String title,author,ISBN;
	Book(String title,String author,String ISBN){
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }

}
class Library{
	ArrayList<Book>Books=new ArrayList<>();
	void addBooks(Book a) {
		Books.add(a);		
		}
	void removeBooks(Book a) {
		Books.remove(a);		
		}
	void displayBooks() {
			for(Book a:Books) {
				System.out.println(a);	
			}
		}
	}
	

public class Books1 {
	public static void main(String[] args) {
		Library lib = new Library();
        Book b1 = new Book("Java Programming", "John Doe", "12345");
        Book b2 = new Book("Data Structures", "Jane Smith", "67890");
        lib.addBooks(b1);
        lib.addBooks(b2);
        lib.displayBooks();
        lib.removeBooks(b1);
        lib.displayBooks();
	}
}
