package com.constructors;

public class StaticDemo {

	static
	{
		System.out.println("I am 1st static block");
	}
	static
	{
		System.out.println("I am 2nd static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo s=new StaticDemo();
		System.out.println("I am in main block");
	}

}
