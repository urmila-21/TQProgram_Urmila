package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StudentQueue {

	public static void printQueue(Queue<Student> sq)
	{
		Iterator<Student> itr= sq.iterator();
		while(itr.hasNext())
		{
		//	Student i=itr.next();
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Student> sq=new PriorityQueue<Student>();
		sq.add(new Student(11,"Urmila",70.8));
		sq.add(new Student(12,"Nikita",50.8));
		sq.add(new Student(13,"Kalpana",60.8));
		sq.add(new Student(14,"Sheetal",80.8));
		sq.add(new Student(15,"Shraddha",56.8));
		sq.add(new Student(16,"Karuna",75.8));
		sq.add(new Student(17,"Ankita",69.8));
		
		System.out.println(sq);
		
		
	}

}
