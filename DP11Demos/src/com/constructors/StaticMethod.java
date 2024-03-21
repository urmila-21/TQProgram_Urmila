package com.constructors;

public class StaticMethod {

	private int eid;
	private String name;
	private double sal;
	private  static String companyName="ThinkQuotient Pvt. Ltd";
	
	static 
	{
		System.out.println("I am in static init block");
		companyName="Infosys";
	}
	public StaticMethod()
	{
		
	}
	public StaticMethod(int eid,String nm,double sal)
	{
		this.eid=eid;
		this.name=nm;
		this.sal=sal;
	}
	public void show()
	{
		System.out.println("Eid ="+eid+" Name "+name+ " Company NAme : "+companyName);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod obj= new StaticMethod(2,"Nikita",49000);
		obj.show();
		StaticMethod.companyName="TQ Ltd";
		obj.show();
	}

}
