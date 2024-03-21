package com.constructors;

public class ExplicitArgument {

	
	public int add(int i,int j)
	{
		System.out.println("add(int,int)");
		return i+j;
	}
	
	public int add(int ... n)
	{
		System.out.println("Array with var-args");
		int sum=0;for(int i=0;i<n.length;i++)
			sum=sum+n[i];
		return sum;
		
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
	
	public long add(long l,long m)
	{
		System.out.println("add(long,long)");
		return l+m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExplicitArgument obj=new ExplicitArgument();
		
		int res=obj.add((int)12,8);
		System.out.println("Addition is "+res);
		System.out.println();
		System.out.println("Addition is "+obj.add((float)12.9f,8));
		System.out.println();
		System.out.println("Addition is "+obj.add((double) 222.53333333333,6222.4388));
		System.out.println();
		
		int res2= obj.add(1234459865, 222222229);
		System.out.println("Addition is "+res2);
}
}
