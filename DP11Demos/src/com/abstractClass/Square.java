package com.abstractClass;

public class Square extends Shape{

	double side;
	Square(double side)
	{
		this.side=side;
	}
	
	public double area()
	{
		return side+side+side+side;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s= new Square(5);
		System.out.println(s.area());
		Shape s2= new Square(3);
		System.out.println(s2.area());
		
	}

}
