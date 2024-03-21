package com.simple_Inner_class;

public class Outer {

	int outer_a;
	Outer()
	{
		
	}
	public void show()
	{
		System.out.println("Outer data member "+outer_a);
		Inner obj=new Inner();
		System.out.println("Inner Data Member "+obj.inner_a);
	}
	class Inner
	{
		int inner_a;
		Inner()
		{
			inner_a=20;
		}
		public void show()
		{
			System.out.println("From Inner show "+inner_a);
			System.out.println("Data MEmber of outer class"+outer_a);
			System.out.println("Data Member of Inner class "+inner_a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		o.show();
		Outer.Inner obj=o.new Inner();
		Outer.Inner obj1=new Outer().new Inner();
		obj1.show();
	}

}
