package com.collectionFrameworks;

import java.util.Comparator;

public class SortByAutherName implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		int count=0;
		if(o1.getAuthor().equals(o2.author))
		count++;
		return count;
		
			
	}

}
