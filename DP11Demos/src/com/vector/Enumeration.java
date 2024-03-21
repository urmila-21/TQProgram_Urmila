package com.vector;

import java.util.Vector;
public class Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v=new Vector<>();
		System.out.println(v.capacity());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(5,60);
		v.capacity();
		System.out.println(v);
		
		v.firstElement();
		v.size();
		
		v.remove(4);
		
		
		System.out.println(v);
		
		java.util.Enumeration<Integer> en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		v.iterator();
	}
	}


