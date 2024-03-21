package com.HashSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts= new TreeSet<String>();
		ts.add("Nexon");
		ts.add("Scoda");
		ts.add("Creta");
		ts.add("Venu");
		ts.add("Mg Hector");
		System.out.println(ts);
		
		Iterator<String> itr= ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet("Scoda"));
		System.out.println(ts.tailSet("Scoda"));
		
		
		TreeSet<String> ts2=  (TreeSet<String>)ts.descendingSet();
		System.out.println("TressSet after decsending order :"+ts2);
		
		
	}

}
