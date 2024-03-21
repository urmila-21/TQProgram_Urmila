package com.ConcurrentHashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map= new ConcurrentHashMap<String,String>();
		map.put("1","1");
		map.put("4","1");
		map.put("3","1");
		map.put("2","1");
		map.put("5","1");
		System.out.println("ConcurrentHashMap befor iterator :"+map);
		
		Iterator<String> it=map.keySet().iterator();
		
		while(it.hasNext())
		{
			String key=it.next();
			if(key.equals("3"))
			{
				map.put(key+"new", "new3");
			}
		}System.out.println(map);
		
		
	}

}
