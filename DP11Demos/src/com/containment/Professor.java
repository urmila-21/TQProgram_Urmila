/*specialization experience, salary,email id,name,id*/
package com.containment;
import java.util.Scanner;
public class Professor {
	
	private int pid,experiance;
	private String name,emailId;
	private double salary;

	Professor()
	{
		pid=0;
		experiance=0;
		name="";
		emailId="";
		salary=0;
		
	}
	
	Professor(int pid,int experiance,String name,String emailId,double salary)
	{
		this.pid=pid;
		this.experiance=experiance;
		this.name=name;
		this.emailId=emailId;
		this.salary=salary;
	}
	
	public void setData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Professor Id ");
		this.pid=sc.nextInt();
		System.out.println("Enter Professor Name ");
		this.name=sc.next();
		System.out.println("Enter Experiance ");
		this.experiance=sc.nextInt();
		
		System.out.println("Enter Email Id ");
		this.emailId=sc.next();
		System.out.println("Enter Salary ");
		this.salary=sc.nextDouble();
	}
	
	
	public void setId(int id)
	{
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor p= new Professor();
		
	}

}
