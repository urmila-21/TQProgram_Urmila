package com.Inheretance;

public class FinalDemo {
	int d;
	int j;
	FinalDemo()
	{
		d=20;
	}
	FinalDemo(int d)
	{
		this.d=d;
	}
	public void show()
	{
		System.out.println(d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final FinalDemo f= new FinalDemo();
		f.show();
		f.j=20;
		//f=new  FinalDemo();
	}
}
