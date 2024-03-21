package com.linkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class OperationLinkedHashMap {

	public static void search(LinkedHashMap<Integer,String> lmap)
	{
		
		String str="Black";
			if(lmap.containsValue(str))
			{
				System.out.println("Elements is present");
			}else
				System.out.println("Element is not present");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String> lmap=new LinkedHashMap<Integer,String>();
		lmap.put(1,"Red");
		lmap.put(2, "Black");
		lmap.put(3, "yellow");
		lmap.put(4,"white");
		lmap.put(5, "Blue");
		
		System.out.println(lmap);
		
		search(lmap);
		
		Set<Entry<Integer,String>> set= lmap.entrySet();
		Iterator<Entry<Integer,String>> itr= set.iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer,String> e=itr.next();
			
			System.out.println(e.getKey());
			
		}
		System.out.println("Remove Element from LinkedHashMap "+lmap.remove(3));
		System.out.println(lmap);
		
		
		
	}

}
