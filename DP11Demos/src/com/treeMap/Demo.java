package com.treeMap;

import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> tmap=new TreeMap<>();
		tmap.put(103, "Urmila");
		tmap.put(101, "Niki");
		tmap.put(106,"Priya");
		tmap.put(105,"Riya");
		tmap.put(102, "Mina");
		
		System.out.println(tmap);
		System.out.println(tmap.firstKey());// only key of first entry
		System.out.println(tmap.firstEntry());// key value pair of first entry
		
		System.out.println(tmap.floorKey(102));
		System.out.println(tmap);
		System.out.println(tmap.floorEntry(103));
	}

}
