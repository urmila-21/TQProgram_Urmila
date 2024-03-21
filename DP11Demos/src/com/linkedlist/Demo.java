package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> str= new LinkedList<>();
		str.add("jiya");
		str.add("urmila");
		str.add("Kalpesh");
		str.add("Mahajan");
		str.add("Pune");
		str.add("wakad");
		str.add("PinkCity");
		str.add("NewEuro");
		str.add("school");
		str.add("om");
		str.add("pranav");
		str.add("urmila");
		str.add("rina");
		str.add("tina");
		str.addFirst("mina");
		str.addLast("lina");
		str.set(5, "riya");
		str.remove(4);
		str.removeFirst();
		str.removeLast();
		
		
		System.out.println("getFirst()"+str.getFirst());
		System.out.println("getLast()"+str.getLast());
		System.out.println(""+str.get(5));
		System.out.println(""+str.offerFirst("tina"));
		System.out.println(""+str.offerLast("rina"));
		System.out.println(""+str.peekFirst());
		System.out.println(""+str.peekLast());
		System.out.println(""+str.pop());
		
		
		Iterator<String> itr=str.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
