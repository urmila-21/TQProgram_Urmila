package com.queue;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyWriteArryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[]{1,3,4,5,67,7,7});
		Iterator<Integer> it= list.iterator();
		while(it.hasNext())
		{
			Integer i=(Integer)it.next();
			System.out.println(i);
			if(i==0)
			{
				list.add(18);
			}
			System.out.println(list);
					
		}
	}

}
