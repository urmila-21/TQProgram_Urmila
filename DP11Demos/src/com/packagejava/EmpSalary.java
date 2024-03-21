package com.packagejava;
import java.util.Scanner;
public class EmpSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bsalary,hra=0,da=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic Salary");
		bsalary=sc.nextDouble();
		
		if(bsalary<=10000)
		{
			hra=0.20*bsalary;
			da=0.80*bsalary;
			
		}else
			if(bsalary<=20000)
			{
				hra=0.25*bsalary;
				da=0.90*bsalary;
				
			}
			else if(bsalary>20000)
			{
				hra=0.30*bsalary;
				da=0.95*bsalary;
			}
				System.out.println("The HRA="+hra+"\nThe DA="+da);
			
	}

}
