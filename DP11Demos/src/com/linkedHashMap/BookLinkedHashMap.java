package com.linkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BookLinkedHashMap {

	public static void bookCopies(LinkedHashMap<Book,Integer> book)
	{
		Set<Entry<Book,Integer>> set=book.entrySet();
		Iterator<Entry<Book,Integer>> itr=set.iterator();
		
		int max=0;
		String str=null;
		Object obj=null;
		while(itr.hasNext())
		{
			
			Entry<Book,Integer> e= itr.next();
			Integer i=e.getValue();
			if(i>max)
			{
				max=i;
				str=e.getKey().getName();
				obj=e.getKey();
			}
			
		}
		System.out.println(obj);
		
		System.out.println("Highest Copy of Book is "+max+" Book :"+str);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Book,Integer> book= new LinkedHashMap<Book,Integer>();
		
		book.put(new Book(1,"Java",200), 20);
		book.put(new Book(2,"C++",100), 30);
		book.put(new Book(3,"Python",240), 40);
		book.put(new Book(4,"DS",250), 25);
		book.put(new Book(5,".Net",100), 10);
		book.put(new Book(6,"Php",180), 28);
		
		bookCopies(book);
		
	}

}
