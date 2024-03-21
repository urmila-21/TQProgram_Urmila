package com.map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> score= new HashMap<String,Integer>();
		score.put("Mumbai Indians",245);
		score.put("Delhi capital",189);
		score.put("Gujarat T", 299);
		score.put("Cheenai Super king", 278);
		
		boolean flag= score.containsKey("Mumbai Indians");
		System.out.println(flag);
		
		boolean v=score.containsValue(200);
		System.out.println(v);
		System.out.println(score.remove("Delhi capital"));
		System.out.println(score);
		
		
	}

}
