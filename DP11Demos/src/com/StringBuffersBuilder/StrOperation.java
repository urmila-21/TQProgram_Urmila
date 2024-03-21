package com.StringBuffersBuilder;

public class StrOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str= new StringBuffer("Hello");
		System.out.println("Str :"+str);
		StringBuffer str1= new StringBuffer("world");
		System.out.println("Str1 :"+str1);
		
		System.out.println("Append the String str + str1 :"+str.append(str1));
		System.out.println(str);
		
		System.out.println("Capacity of String str :"+str.capacity());
		System.out.println("Capacity of String str1 :"+str1.capacity());
		
		System.out.println("Delete string from 0 to 6th index :"+str.delete(0, 6));
		
		System.out.println("Insert "+str.insert(0, "W"));
		System.out.println("Replace "+str.replace(4, 4, "B"));
		
		System.out.println(str.charAt(0));
	}

}
