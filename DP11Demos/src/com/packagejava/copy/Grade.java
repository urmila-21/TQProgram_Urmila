package com.packagejava.copy;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1,perc;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the Markes:");
		n1= sc.nextDouble();
	
		
		if(n1>=90)
		{
			perc=(n1/100)*100;
			System.out.println("The Grade is A+ = "+n1+"%");
		}
		else if(n1>=80 && n1<=90)
		{
			perc=(n1/100)*100;
			System.out.println("The Grade is A = "+n1+"%");
		}
		else if(n1>=70 && n1<=80)
		{
			perc=(n1/100)*100;
			System.out.println("The Grade is B = "+n1+"%");
		}
		else if(n1>=60 && n1<=70)
		{
			System.out.println("The Grade is C = "+n1+"%");
		}
		else if(n1>=50 && n1<=60)
		{
			System.out.println("The Grade is D = "+n1+"%");
		}
		else if(n1>=40 && n1<=50)
		{
			System.out.println("The Grade is C = "+n1+"%");
		}
		else if(n1>=30 && n1<=40)
		{
			System.out.println("The Grade is Fail = "+n1+"%");
		}
	}

}
