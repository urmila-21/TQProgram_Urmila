package com.abstractClass;

public class Circle extends Shape{
	
	double r;
	public Circle(double r)
	{
		this.r=r;
	}

	public double area()
	{
		return 3.14*r*r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj=new Circle(3.5);
		System.out.println(obj.area());
		Shape s=new Circle(2.3);
		System.out.println(s.area());
		
	}

}
