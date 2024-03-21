package com.constructors;

public class Constructor {

	 int empId,empSal;
	 String empName;
	 long mobileno;
	
	Constructor()
	{
		System.out.println("This is Default Constructor");
		empId=1;
		empSal=50000;
		empName="Urmila";
		mobileno=987654322;
	}
	
	Constructor( int empId,int empSal, String empName, long mobileno)
	{
		System.out.println("This is Parametric Constructor");
		empId=1;
		empSal=50000;
		empName="Urmila";
		mobileno=987654322;
		
		
	}
	public void show()
	{
		System.out.println("Employee Name : "+empName+"\nEmployee Id : "+empId+" \nEmployee Salary : "+empSal+" \nEmployee Mobile No: "+mobileno);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor();
		c.show();
		Constructor c2=new Constructor(1,30000,"abc",987654321);
		c2.show();
	}

}
