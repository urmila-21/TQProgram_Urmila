package com.treeMap;

import java.util.TreeMap;

public class EmployeeTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee(1,"Urmila",50000);
		Employee e2=new Employee(2,"Niki",121500);
		Employee e3=new Employee(3,"Sheetal",150000);
		Employee e4=new Employee(4,"Karuna",55000);
		Employee e5=new Employee(5,"Shraddha",150000);
		
		EmployeeComparator ec= new EmployeeComparator();
		//TreeMap<Employee> emp= new TreeMap<>(ec);
		
	}

}
