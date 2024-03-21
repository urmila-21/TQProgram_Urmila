package com.collectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class BookArrayList {
	
	public static void authorWiseBookNames(ArrayList<Book> bl)
	{
		
		for(int i=0;i<bl.size();i++)
		{
			ArrayList<String> books =new ArrayList<>();
			for(int j=0;j<bl.size();j++)
			{
				if((bl.get(i).getAuthor()).equals(bl.get(j).getAuthor()) && j<i)
					break;
				else if(bl.get(i).getAuthor().equals(bl.get(j).getAuthor()))
				{
					books.add(bl.get(j).getBookname());
				}
				if(!books.isEmpty())
				{
					System.out.println(bl.get(i).getAuthor()+"->"+books);
				}
			}
		}
	}
	
	public static void authorWiseBooks(ArrayList<Book> bl)
	{
		int count;
		for(int i=0;i<bl.size();i++)
		{
			count=0;
			for(int j=0;j<bl.size();j++)
			{
				
				if((bl.get(i).getAuthor()).equals(bl.get(j).getAuthor()) && j<i)
				
					break;
				else if(bl.get(i).getAuthor().equals(bl.get(j).getAuthor())) 
					count++;
				
			}if(count >0)
			{
				System.out.println(bl.get(i).getAuthor()+"->"+count+" book");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Book> arr= new ArrayList<Book>();
		arr.add(new Book(111,"Think Like a monk","Jay shetty",150));
		arr.add(new Book(121,"Harry Potter","J.K.Rowling",180));
		arr.add(new Book(121,"Harry Potter 2","J.K.Rowling",180));
		arr.add(new Book(121,"Harry Potter 3","J.K.Rowling",180));
		arr.add(new Book(131,"A river sutra","Chetan Bhagat",200));
		arr.add(new Book(141,"Bhagvat Gita","S. Radhakrishnan",150));
		arr.add(new Book(161,"Bhagvat Gita 2","S. Radhakrishnan",400));
		arr.add(new Book(151,"Ignited Minds","A.P.J. Abdul Kalam",100));
		
		Iterator<Book> itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("List before sorting");
		System.out.println(arr);
		
		System.out.println("List after sorting by book by name");
		
		Collections.sort(arr,new SortByBookname());
		System.out.println(arr);
		
		System.out.println("List after sorting by book by Id");
		
		Collections.sort(arr,new SortByBookId());
		System.out.println(arr);
		
		System.out.println("count AuthorWise books ");
		authorWiseBooks(arr);
		
		System.out.println("List of Author Name with its Number of Books name");
		authorWiseBookNames(arr);
	}

}
