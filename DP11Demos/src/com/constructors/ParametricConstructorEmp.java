package com.constructors;

public class ParametricConstructorEmp {

	 int empId,empSal;
	 String empName;
	 long mobileno;
	
	 ParametricConstructorEmp(int empId,int empSal,String empName, long mobileno)
	{
		System.out.println("This is parametric Constructor");
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
		ParametricConstructorEmp obj;
		obj=new ParametricConstructorEmp(1,50000,"Abc",897755544);
		obj.show();
	}
	
}
