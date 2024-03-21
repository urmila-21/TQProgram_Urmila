package com.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class AppleHashMap {
	
	public static void print(HashMap<String, Integer> apple)
	{
		Set<Entry<String, Integer>> set=apple.entrySet();
		for(Entry<String, Integer> e:set)
		{
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> apple= new HashMap<String,Integer>();
		apple.put("Kashmiri", 160);
		apple.put("Washington",300);
		apple.put("Green", 290);
		
		print(apple);
		apple.put("Simla",105);
		System.out.println("AFter Adding");
		
		System.out.println(apple);
	}

}
