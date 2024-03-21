package com.map;

public class Book {
		
		int bookId;
		String bookname;
		double price;
		String author;
		
		Book()
		{
			
		}
		Book(int bookId,String bookname,String author,double price)
		{
			this.bookId=bookId;
			this.bookname=bookname;
			this.author=author;
			this.price=price;
		}
		
		
		
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getBookname() {
			return bookname;
		}
		public void setBookname(String bookname) {
			this.bookname = bookname;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		public String toString()
		{
			return "Book Id :"+bookId+"\tBook Name : "+bookname+"\tAuthor : "+author+"\tPrice : "+price+"\n";
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Book b=new Book();
			System.out.println(b);
			
			//Book b1= new Book(111,"Wings Of Fire","A.P.J. Abdul Kalam",100);
		}

	}
