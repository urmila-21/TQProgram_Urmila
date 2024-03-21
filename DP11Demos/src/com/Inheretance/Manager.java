package com.Inheretance;

public class Manager extends Emp{
	
	int noofemp,id;
	double bonus,salary;
	public Manager()
	{
		super();
		noofemp=0;
		bonus=0;
	}
	public Manager(int id,String name,double salary, int n,double b)
	{
		super(id,name,salary);
		noofemp=n;
		bonus=b;
		
		
	}
	public void calculatesalary()
	{
		super.calculatesalary();
		super.netsalary=super.netsalary+bonus;
	}
	public String toString()
	{
		return super.toString()+"\nNumber of Employee :"+noofemp+"\nBonus :"+bonus;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
		m.calculatesalary();
		System.out.println(m);
		System.out.println("___________________________________");
		Manager mp=new Manager(101,"Urmila",5000,5,3000);
		mp.calculatesalary();
		System.out.println(mp);
	}

}
