package com.map;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBook {

	
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
	}

}
