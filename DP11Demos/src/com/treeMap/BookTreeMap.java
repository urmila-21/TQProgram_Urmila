package com.treeMap;

import java.util.TreeMap;

public class BookTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1=new Book(101,"Hindi",4566f);
		Book b2=new Book(104,"Marathi",1566f);
		Book b3=new Book(108,"English",5566f);
		Book b4=new Book(103,"History",666f);
		Book b5=new Book(102,"Maths",1346f);
		Book b6=new Book(106,"Science",866f);
		
		BookComparator obj=new BookComparator();
		TreeMap<Book,Integer> tmap =new TreeMap<>(obj);
		
		tmap.put(b3,124);
		tmap.put(b6,121);
		tmap.put(b1,543);
		tmap.put(b2,276);
		tmap.put(b4,421);
		tmap.put(b5,621);
		tmap.put(b6,791);
		System.out.println(tmap);
	}

}
