package com.String;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		System.out.println(str);
		System.out.println(str.hashCode());

		String s1 = new String("Hello");
		System.out.println(s1);
		System.out.println(s1.hashCode());

		String s2 = new String("Hello2");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		char ch[]= {'a', 'e','i', 'o', 'u'};
		String s4=new String(ch);
		System.out.println(s4);
	}

}
