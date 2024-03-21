package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q= new PriorityQueue<>();
		q.add(10);
		q.add(20);
		q.add(8);
		q.add(40);
		q.add(50);
		
		System.out.println(q);
		System.out.println(q.offer(10));
		
		Iterator<Integer> itr= q.iterator();
		while(itr.hasNext())
		{
			int i=itr.next();
			System.out.println(i+" ");
		}
		System.out.println();
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
	}

}
