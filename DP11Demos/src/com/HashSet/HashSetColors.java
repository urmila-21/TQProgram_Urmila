package com.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> color= new HashSet<>();
		color.add("Blue");
		color.add("Red");
		color.add("Green");
		color.add("Pink");
		color.add("Yellow");
		System.out.println(color);
		
		Iterator<String> itr=color.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
