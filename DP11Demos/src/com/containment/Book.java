/*WAP for Book class with following datamembers and methods 
 * bookid,bookName,price, discount,discountPrice,copies,author
 * constructors 
 * setdata()
 * calculate price()
 * display()
 * 
 * */

package com.containment;
public class Book {

	private int bookId,copies;
	private String bookName;
	private double price,discount,discountPrice;
	private Author author;
	
	Book()
	{
		
	}
	
	Book(int bookId,int copies,String bookName,double price,double discount,Author author)
	{
		this.bookId=bookId;
		this.copies=copies;
		this.bookName=bookName;
		this.price=price;
		this.discount=discount;
		this.author=author;
	}
	
	public void setId(int bookId)
	{
		this.bookId=bookId;
	}
	public int getId()
	{
		return bookId;
	}
	
	
	public void setcopies(int copies)
	{
		this.copies=copies;
	}
	public int getcopies()
	{
		return copies;
	}
	
	public void setbookName(String bookName)
	{
		this.bookName=bookName;
	}
	public String getbookName()
	{
		return bookName;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	
	
	public void setdiscount(double discount)
	{
		this.discount=discount;
	}
	public double getdiscount()
	{
		return discount;
	}
	
	/*
	public void setdiscountPrice(double discountPrice)
	{
		this.discountPrice=discountPrice;
	}
	public double getdiscountPrice()
	{
		return discountPrice;
	}
	*/
	public void setAuthor(Author author)
	{
		this.author=author;
	}
	public Author getAuthor()
	{
		return author;
	}
	
	
	public void calculatePrice()
	{
		discountPrice=price-(0.10*price);
	}
	
	public void display()
	{
		
		System.out.println("Book Id \t:"+bookId);
		System.out.println("Copies  \t:"+copies);
		System.out.println("Book Name \t: "+bookName);
		System.out.println("Book Price \t: "+price);
		System.out.println("Discount  \t:"+discount);
		System.out.println("Discounted Price  :"+discountPrice);
		
		author.display();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Book b= new Book();
		
		
		b.setId(121);
		b.getId();
		b.setcopies(4);
		b.getcopies();
		b.setbookName("Harry Potter");
		b.getbookName();
		b.setdiscount(0.10);
		b.getdiscount();
		b.setPrice(100);
		b.getPrice();
		
		b.calculatePrice();
		b.display();*/
		
		
		Author a=new Author(121,"A.P.J. Abdul kalam","apjk123@gmail.com");
		
		Book b2= new Book(123,54,"WOF",2050,0.05,a);
		b2.calculatePrice();
		b2.display();
		
	}

}
