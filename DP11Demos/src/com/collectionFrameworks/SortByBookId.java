package com.collectionFrameworks;

import java.util.Comparator;

public class SortByBookId implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		if(o1.price==o2.price)
		{
			if(o1.bookId>o2.bookId)
				return 1;
			else
				return -1;
			
		}
		else if(o1.price<o2.price)
			return -1;
		else
			return 0;
		
	}

}
