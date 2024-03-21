package com.wrapping;

public class Demo4 {

	public static void mymethod(Long l)
	{
		System.out.println("In Long parameter");
	}
	public static void mymethod(Integer i)
	{
		System.out.println("In Integer parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=22;
		mymethod(i);
	}

}
