package com.linkedHashMap;
import java.util.*; 

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>(); 
		 
		 hm.put(100,"Amit"); 
		 hm.put(101,"Vijay"); 
		 hm.put(102,"Rahul"); 
		 
		 for(Map.Entry m:hm.entrySet()){ 

			 System.out.println(m.getKey()+" "+m.getValue()); 
			 } 
	} 
} 

