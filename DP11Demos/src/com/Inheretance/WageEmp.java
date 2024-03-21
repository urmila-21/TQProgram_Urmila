package com.Inheretance;

public class WageEmp extends Emp {

	float rate,hrs;
	
	WageEmp() {
		super();
		rate=0;
		hrs=0;
	}
	WageEmp(int eid,String name,double salary,float r,float h)
	{
		super(eid,name,salary);
		rate=r;
		hrs=h;
	}
	
	public void calculatesalary()
	{
		super.calculatesalary();
		super.netsalary=super.netsalary+hrs*rate;
		
	}
	
	public String toString()
	{
		return super.toString()+"\nHours :"+hrs+"\nRate :"+rate;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WageEmp w= new WageEmp();
		w.calculatesalary();
		System.out.println(w);
		System.out.println("______________________________");
		WageEmp w2= new WageEmp(123,"Urmila",400000,2.2f,6.5f);
		w2.calculatesalary();
		System.out.println(w2);
		
	}

}
