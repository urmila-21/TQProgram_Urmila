package com.Inheretance;

public class A {
	
	int i;
	A()
	{
		
		System.out.println("I am in A()");
		i=10;
	}
	A(int i)
	{
		System.out.println("I am in A(int )");
		this.i=i;
	}

	public void show()
	{
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.show();
	}

}
