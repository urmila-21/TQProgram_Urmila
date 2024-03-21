package com.collectionFrameworks;

import java.util.*;

import com.collectionArrayList.Student;

import java.io.*;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ArrayList<Student> arr = new ArrayList<Student>();
		// arr.add(new Student());
		

		Iterator<Student> itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
