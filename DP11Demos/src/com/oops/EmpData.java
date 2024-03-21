package com.oops;
import java.util.Scanner;
public class EmpData {

		int eid;
		String name,addrs,dname,desig;
		double salary,pf,hra,da,netsal;
		long mobno;
		public void setData()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Eid");
			eid=sc.nextInt();
			System.out.println("Enter the Name");
			name=sc.next();
			System.out.println("Enter the Address");
			addrs=sc.next();
			System.out.println("Enter the Department Name");
			dname=sc.next();
			System.out.println("Enter the Designation");
			desig=sc.next();
			System.out.println("Enter the salary");
			salary=sc.nextInt();
			System.out.println("Enter the PF");
			pf=sc.nextInt();
			System.out.println("Enter the HRA");
			hra=sc.nextInt();
			System.out.println("Enter the DA");
			da=sc.nextInt();
			System.out.println("Enter the Nest Salary");
			eid=sc.nextInt();
			System.out.println("Enter the Mobile No");
			mobno=sc.nextLong();
		}
		public void show()
		{
			System.out.println("You have entered below Information");
			System.out.println("Name 			"+name);
			System.out.println("Address			"+addrs);
			System.out.println("Department Name			"+dname);
			System.out.println("Designation         "+desig);
			System.out.println("Salary              "+salary);
			System.out.println("PF                  "+pf);
			System.out.println("HRA                 "+hra);
			System.out.println("DA                  "+da);
			System.out.println("Net Salary          "+pf);
			System.out.println("Mobile No           "+mobno);
		}



		public static void main(String[] args) 
			// TODO Auto-generated method stub
		{
			EmpData obj=new EmpData();
			obj.setData();
			obj.show();
			
		}
}			

