package com.vector;

import java.util.Iterator;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v= new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(5,60);
		v.capacity();
		System.out.println(v);
		int v1=20;
		
		v.addElement(v1);
		
		v.firstElement();
		v.size();
		
		v.remove(6);
		
		
		System.out.println(v);
		Iterator<Integer> itr= v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
