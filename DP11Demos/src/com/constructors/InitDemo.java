package com.constructors;

public class InitDemo {
	
	int i,j;
	{
		i=12;
		j=2;
		System.out.println("I am in instance init block");
	}
	{
		
		System.out.println("I am in 2nd instance init block");
	}
	static
	{
		int i=2,j=2;
		System.out.println("I am in static init block");
	}
	public InitDemo()
	{
		System.out.println("I am in default constructor");
	}
	public InitDemo(int i,int j)
	{
		System.out.println("I am in Parameterized constructor");
		this.i=i;
		this.j=j;
	}
	
	public void show()
	{
		
		System.out.println(i+" "+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in main");
		InitDemo i=new InitDemo();
		InitDemo i2=new InitDemo();
		i.show();
		i2.show();
	}

}
