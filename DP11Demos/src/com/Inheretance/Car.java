package com.Inheretance;

public class Car {

	int regno;
	String name,colour;
	double price;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int regno,String name,double price,String colour) {
		// TODO Auto-generated constructor stub
		this.regno=regno;
		this.name=name;
		this.price=price;
		this.colour=colour;
	}
	public String toString()
	{
		return " Registration No :"+regno+"\n Name :"+name+"\n Colour :"+colour+"\n Price :"+price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c= new Car();
		System.out.println(c);
		System.out.println("____________________________________________");
		Car c2=new Car(4321,"Nexon",1200000,"white");
		System.out.println(c2);
		
	}

}
