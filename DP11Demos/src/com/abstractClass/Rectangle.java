package com.abstractClass;

public class Rectangle extends Shape{
	
	double l,b;

	Rectangle(double l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public double area()
	{
		return l*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r= new Rectangle(4.3,6);
		System.out.println(r.area());
		Shape s1= new Rectangle(4.3,6);
		System.out.println(s1.area());
		
	}

}
