package com.collectionFrameworks;

import java.util.Comparator;


	public class SortByBookname implements Comparator<Book> {

		@Override
		public int compare(Book o1, Book o2) {
			// TODO Auto-generated method stub
			return o1.bookname.compareTo(o2.bookname);
		}

	}


