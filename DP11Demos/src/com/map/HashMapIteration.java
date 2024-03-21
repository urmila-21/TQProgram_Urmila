package com.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> course=new HashMap<Integer,String>();
		course.put(101, "IT");
		course.put(102, "Networking");
		course.put(103, "Data Structure");
		course.put(104, "Advance DBMS");
		course.put(105, "DA");
		course.put(106, "Software Engineering");
		course.put(107, "IT");
		
		
		System.out.println("Map iteration using keyset() and Iterator");
		Set<Integer> set=course.keySet();
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext())
		{
			int i=itr.next();
			System.out.println(i+ " : "+course.get(i));
		}
		
		System.out.println("Map Iteration using enterySet() ");
		Set<Entry<Integer,String>> entry=course.entrySet();
		Iterator<Entry<Integer,String>> itr1=entry.iterator();
		
		while(itr1.hasNext())
		{
			Entry<Integer,String> en=itr1.next();
			System.out.println(en.getKey()+" : "+en.getValue());
		}
		
		System.out.println("Map Iteration using Enhance forLoop");
		
		for(Entry<Integer,String> e:entry)
		{
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}

}
