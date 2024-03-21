package com.staticinnerclass;

public class Outer {
	
	static int data;
	public Outer()
	{
		data=100;
	}
	public void show()
	{
		Inner in= new Inner();
		in.display();
	}
	static class Inner
	{
		int num=10;
		public void display()
		{
			System.out.println("Static inner class data "+num);
			System.out.println("Outer class data "+data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner obj=new Outer.Inner();
		obj.display();
	}

}
