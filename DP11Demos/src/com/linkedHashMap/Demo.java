package com.linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hmap= new HashMap<>();
		hmap.put(101, "urmila");
		hmap.put(103, "Mahajan");
		hmap.put(102, "Kalpesh");
		
		System.out.println(hmap);
		
		LinkedHashMap<Integer,String> lmap= new LinkedHashMap<>();
		lmap.put(101, "urmila");
		lmap.put(103, "Mahajan");
		lmap.put(102, "Kalpesh");
		
		System.out.println(lmap);
	}

}
