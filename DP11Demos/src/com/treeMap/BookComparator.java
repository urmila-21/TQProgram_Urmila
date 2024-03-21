package com.treeMap;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	public int compare(Book o1,Book o2)
	{
		Integer i=o1.id;
		Integer j=o2.id;
		return i.compareTo(j);
	}
	
}
