package com.constructors;

public class PolymorphismAdd {

	public int add(int i,int j)
	{
		System.out.println("add(int,int)");
		return i+j;
	}
	
	public float add(float f,int i)
	{
		System.out.println("add(float,int)");
		return f+i;
	}
	
	public double add(double d,double e)
	{
		System.out.println("add(double,double)");
		return d+e;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismAdd obj=new PolymorphismAdd();
		
		int r=obj.add(5,10);
		
		System.out.println("Addition is "+r);
		System.out.println();
		System.out.println("Addition is "+obj.add(12.7f, 8.0f));
		System.out.println();
		System.out.println("Addition is "+obj.add(14.7f, 8.8f));

	}

}
