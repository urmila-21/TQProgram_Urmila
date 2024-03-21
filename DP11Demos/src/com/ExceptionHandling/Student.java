package com.ExceptionHandling;
import java.nio.InvalidMarkException;
import java.util.Scanner;
public class Student {
	
	int rollno,marks;
	String name;
	public Student()
	{
		
	}
	public void setData() throws InvalidMarkException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno ");
		rollno=sc.nextInt();
		System.out.println("Enter NAme");
		name=sc.next();
		System.out.println("Enter mark out of 100 ");
		marks=sc.nextInt();
		if(marks<0 || marks>100)
			throw new InvalidMarkException();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		try {
			s.setData();
		}catch(InvalidMarkException e)
		{
			System.out.println(e);
		}
	}

}
