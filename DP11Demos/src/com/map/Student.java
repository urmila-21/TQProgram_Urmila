package com.map;

public class Student {
	
	private int rollno;
	private String name;
	
	Student()
	{
		
	}
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
