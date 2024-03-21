package com.Inheretance;

public class Vehical extends Car{

	String type,cname;
	public Vehical()
	{
		
	}
	public Vehical(int regno,String name,double price,String colour,String type,String cname)
	{
		super(regno,name,price,colour);
		this.type=type;
		this.cname=cname;
		
	}
	public void show()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehical v= new Vehical();
		
	}

}
