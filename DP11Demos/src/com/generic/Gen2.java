package com.generic;

public class Gen2<A,B> {

	A obja;
	B objb;
	
	public Gen2()
	{
		
	}
	public Gen2(A a,B b)
	{
		obja=a;
		objb=b;
	}
	public A getObject()
	{
		return obja;
	}
	public B getObject1()
	{
		return objb;
	}
	public void showType()
	{
		System.out.println(obja.getClass().getTypeName()+objb.getClass().getTypeName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen2<Integer,Integer> obj=new Gen2<Integer,Integer>(10,20);
		int a=obj.getObject();
		
		Gen2<String,String> str=new Gen2<String,String>("Java","Sql");
		String s=str.getObject();
	}

}
