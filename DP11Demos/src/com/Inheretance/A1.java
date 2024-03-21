package com.Inheretance;

public class A1 {
	int data;
	A1(int d1)
	{
	 data=d1;
	}
}
 class B1 extends A1{
	
	int data;
	B1(int d1,int d2)
	{
		super(d1);
		data=d2;
	}
 
	public void show()
	{
		System.out.println(this.data);
		System.out.println(super.data);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj= new A1(1);
		B1 obj2= new B1(2,3);
		
		
	}

}