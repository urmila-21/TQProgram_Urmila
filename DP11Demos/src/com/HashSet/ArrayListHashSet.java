package com.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayListHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> arr =new ArrayList<Integer>(Arrays.asList(9,1,6,3,1,8,6,7));
		System.out.println("Using ArrayList");
		System.out.println(arr);
		
		
		HashSet<Integer> hset= new HashSet<Integer>(arr);
		System.out.println("Using HashSet");
		System.out.println(hset);
		
		TreeSet<Integer> tset = new TreeSet<Integer>(hset);
		System.out.println("Using TreeSet");
		System.out.println(tset);
		
		LinkedHashSet<Integer> lhset= new LinkedHashSet<Integer>(arr);
		System.out.println("Using LinkedHashSet");
		System.out.println(lhset);
		
	}

}
