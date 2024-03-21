package com.interfacem;


public class C implements MyInterface{
	MyInterface obj;
	C(MyInterface obj)
	{
		this.obj=obj;
	}
	public void print()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj =new A();
		B obj1= new B();
		C obj2=new C(obj);
	}

}