package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CustomerHashMap {
	

		public static void print(HashMap<Customer, Double> cust)
		{
			System.out.println("Iteration using Enhance for loop");
			Set<Entry<Customer, Double>> set=cust.entrySet();
			for(Entry<Customer, Double> e:set)
			{
				System.out.println(e.getKey()+":"+e.getValue());
			}
			
			System.out.println("\nMap iteration using entrySet() and and Iterator()\n");
			Set<Entry<Customer,Double>> entry=cust.entrySet();
			Iterator<Entry<Customer,Double>> itr=entry.iterator();
			while(itr.hasNext())
			{
				Entry<Customer,Double> en=itr.next();
				System.out.println(en.getKey()+" : "+en.getValue());
			}
			
			System.out.println("\nMap Iteration using keySet() and Iterator\n");
			Set<Customer> set2=cust.keySet();
			Iterator<Customer> itr2= set2.iterator();
			while(itr2.hasNext())
			{
				Customer i=itr2.next();
				System.out.println(i +" : "+cust.get(i));
			}
		}
		
		public static void FiveStarRating(HashMap<Customer,Double> map)
		{
			Set<Entry<Customer,Double>> entry=map.entrySet();
	
			for(Entry<Customer,Double> e:entry)
			{
				if(e.getValue()== 5.0)
				{
					System.out.println(e.getKey().getName());
				}
			}
		}
		
		public static void countBelowRating(HashMap<Customer,Double> map)
		{
			int count =0;
			Set<Entry<Customer,Double>> entry=map.entrySet();
			
			for(Entry<Customer,Double> e:entry)
			{
				 
				if(e.getValue()<3.0)
				{
					count++;
				
				}
			}
			System.out.println(count);
			
		}
		public static void area(HashMap<Customer,Double> map)
		{
			Set<Entry<Customer,Double>> entry=map.entrySet();
			
			for(Entry<Customer,Double> e:entry)
			{
				 
//				if(e.getValue())
//				{
//					
//				
//				}
			}
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			HashMap<Customer, Double> cust=new HashMap<Customer, Double>();
			cust.put(new Customer(121,"Urmila","Pune","urmi234@gmail.com",234567890), 4.5);
			cust.put(new Customer(123,"Nikita","Nashik","niki234@gmail.com",234567890), 2.5);
			cust.put(new Customer(124,"Rina","wakad","rina234@gmail.com",234567890), 3.5);
			cust.put(new Customer(125,"Tina","kalyan","tina@gmail.com",234567890), 5.0);

			cust.put(new Customer(126,"Mina","thane","mina@gmail.com",234567890), 4.5);
			cust.put(new Customer(127,"Riya","Nashik","riya@gmail.com",234567890), 2.5);
			cust.put(new Customer(128,"Priya","dhule","priya4@gmail.com",234567890), 3.5);
			cust.put(new Customer(129,"Jiya","pune","jiya@gmail.com",234567890), 5.0);

	        print(cust);
	        System.out.println();
	        System.out.println("5 star rating customer");
	        FiveStarRating(cust);
	        
	        System.out.println();
	        System.out.println("Less than 3 rating");
	        countBelowRating(cust);
	        
		}

	}

