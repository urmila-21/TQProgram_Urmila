package com.Inheretance;

public class Emp{

	int empid;
	double bsalary,netsalary,pf=10,hra=12,da=15;
	String name;
	
	public Emp()
	{
		
	}
	public Emp(int eid,String name,double bsalary)
	{
		this.empid=eid;
		this.name=name;
		this.bsalary=bsalary;
	}
	public void calculatesalary()
	{
		pf=10*bsalary;
		hra=12*bsalary;
		da=15*bsalary;
		netsalary=bsalary-pf+hra+da;
		
	}
	public String toString()
	{
		return "Employee Id :\t"+empid+"\nEmployee Name :\t"+name+"\nBasic Salary :\t"+bsalary+"\nNet Salary :\t"+netsalary+"\nPF :\t\t"+pf+"\nHRA :\t\t"+hra+"\nDA :\t\t"+da;
	}
	
	public void print()
	{
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp();
		System.out.println(e);
		System.out.println("_________________________________________");
		Emp e2=new Emp(121,"Tina",100000);
		e2.calculatesalary();
		System.out.println(e2);
	}

}
