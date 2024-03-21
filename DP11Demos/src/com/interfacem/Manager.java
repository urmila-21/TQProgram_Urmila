package com.interfacem;


public class Manager implements MyInterface{
	
	int noofemp,id;
	String name;
	double salary;
	public Manager()
	{
		
	}
	public Manager(int id,String name,double salary)
	{
	this.id=id;
	this.name=name;
	this.salary=salary;
	}
	
	public void print()
	{
		System.out.println("I am in Manager ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
		m.print();
		//MyInterface m1= new Manager();
		//m1.print();
	}

}
