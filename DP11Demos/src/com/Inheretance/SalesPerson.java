package com.Inheretance;

public class SalesPerson extends Emp {

	
	double sales, commission;
	SalesPerson()
	{
		super();
		sales=0;
		commission=0;
	}
	SalesPerson(int eid,String name,double salary,double s,double com)
	{
		super(eid,name,salary);
		sales=s;
		commission=com;
	}
	public void calculatesalary()
	{
		super.calculatesalary();
		super.netsalary=super.netsalary+sales*commission;
	}
	
	public String toString()
	{
		return super.toString()+"\nSales :\t\t"+sales+"\nCommission :\t"+commission;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SalesPerson s= new SalesPerson();
		s.calculatesalary();
		System.out.println(s);
		System.out.println("____________________________________________");
		
		SalesPerson s2=new SalesPerson(4123,"Rina",40000,300,0.3);
		s2.calculatesalary();
		System.out.println(s2);
		
		
	}

}
