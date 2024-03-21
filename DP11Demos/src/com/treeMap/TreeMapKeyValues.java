package com.treeMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapKeyValues {
	
	public static void highestKey(TreeMap<Integer,String> tmap)
	{
		Set<Entry<Integer,String>> set=tmap.entrySet();
		Iterator<Entry<Integer,String>> itr=set.iterator();
		
		int max=0;
		String str=null;
		while(itr.hasNext())
		{
			
			Entry<Integer,String> e= itr.next();
			Integer i=e.getKey();
			if(i>max)
			{
				max=i;
				str=e.getValue();
			}
		}System.out.println("The Highest key is "+max+" "+str);
	}
	
	public static void leastKey(TreeMap<Integer,String> tmap)
	{
		Set<Entry<Integer,String>> set= tmap.entrySet();
		Iterator<Entry<Integer,String>> itr=set.iterator();
		
		int min=0;
		String str=null;
		while(itr.hasNext())
		{
			Entry<Integer,String> e=itr.next();
			Integer i=e.getKey();
			if(i<min)
			{
				min=i;
				str=e.getValue();
			}
		}System.out.println("The Least Key is "+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(1, "Urmila");
		tmap.put(3, "niki");
		tmap.put(2, "Karuna");
		tmap.put(5, "Shraddha");
		tmap.put(14, "Sheetal");
		tmap.put(9, "Varsha");
		tmap.put(8, "Priya");
		tmap.put(13, "Riya");
		
		System.out.println(tmap);
		
		highestKey(tmap);
		leastKey(tmap);
		
	}

}
