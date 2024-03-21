/*
 * WAP for Book class with following datamembers and methods 
 * bookid,bookName,price discount,discountPrice,copies,author
 * constructors 
 * setdata()
 * calculate price()
 * display()
 * 
 * 
 * Author
 * authorId,authorName,email
 * constructors()
 * display()
 * 
 * */
package com.containment;

public class Author {
	
	int authorId;
	String authorName,email;
	
	Author()
	{
		
	}
	Author(int authorId,String authorName,String email)
	{
		this.authorId=authorId;
		this.authorName=authorName;
		this.email=email;
		
	}

	public void display()
	{
		
		System.out.println("Author Id : "+authorId+ "\nAuthor Name : "+authorName+"\nEmail Id : "+email);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a=new Author(123,"Chetan Bhagat","chetanB@123");
		a.display();
		
	}

}
