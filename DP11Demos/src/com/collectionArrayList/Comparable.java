package com.collectionArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,4,2,6,88,3,9,5,3,6);
		System.out.println(list);
		System.out.println("Reverse List");
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("After Sorting");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Reverse List");
		Collections.reverse(list);
		System.out.println(list);
	}

}
