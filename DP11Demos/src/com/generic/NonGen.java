package com.generic;

public class NonGen {

	Object obj;
	public NonGen()
	{
		
	}
	public NonGen(Object o)
	{
		obj=o;
	}
	public Object getObject()
	{
		return obj;
	}
	public void showType()
	{
		System.out.println(obj.getClass().getTypeName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonGen obj= new NonGen(12);
		int i=(int) obj.getObject();
		
		NonGen obj1=new NonGen("Java");
		obj1.showType();
		String str=(String) obj1.getObject();
		//obj=obj1;
		int i2=(int) obj.getObject();
	}

}
