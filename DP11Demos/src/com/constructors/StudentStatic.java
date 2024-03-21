package com.constructors;

public class StudentStatic {

	int rollno;
	String name;
	static String collegename="ITS";
	
	StudentStatic(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	
	}
	public void display()
	{
		System.out.println("Student Id= "+rollno+"\nStudent Name= "+name+"\nCollege Name= "+collegename);
	}
	public static void main(String[] args) {
		StudentStatic s=new StudentStatic(4,"Urmila");
		s.display();
		StudentStatic s2=new StudentStatic(3,"Niki");
		s2.display();
	}

}