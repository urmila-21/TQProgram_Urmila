package com.Inheretance;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp obj= new Manager();
		Emp obj2=new WageEmp();
		Emp obj3=new SalesPerson();
		obj.calculatesalary();
		obj2.bsalary=2000;
		obj3.netsalary=20;
		//((Manager) obj).setbonus(23000);
		((Manager) obj).bonus=200000;
			}

}
