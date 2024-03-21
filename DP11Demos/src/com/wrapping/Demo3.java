package com.wrapping;

public class Demo3 {

	public static void mymethod(Integer I)
	{
		System.out.println("In Interger Parameter");
	}
	public static void mymethod(Long i)
	{
		System.out.println("In Long Parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=22;
		mymethod(i);
	}

}
