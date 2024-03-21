package com.oops;

public class ConstructorEmployee {

	 int empId,empSal;
	 String empName;
	 long mobileno;
	
	ConstructorEmployee()
	{
		System.out.println("This is Default Constructor");
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
		ConstructorEmployee c=new ConstructorEmployee();
		
		c.empId=1;
		c.empSal=40000;
		c.empName="ABC";
		c.mobileno=123456789;
		c.show();
	}

}
