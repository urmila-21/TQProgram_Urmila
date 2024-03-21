package com.treeMap;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	double salary;
	
	Employee()
	{
		
	}
	
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
		@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
		public int compareTo(Employee e)
		{
			if(this.id==e.id)
			return 0;
			else if(this.id>e.id)
				return 1;
			else
				return -1;
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
