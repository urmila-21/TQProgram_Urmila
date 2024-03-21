package com.oops;
import java.util.Scanner;
public class Factorial {
	
			int fact=1,num;
			public int setData(int n)
			{
				num=n;
				return num;
			}
			public void findFact()
			{
				for(int i=1;i<=num;i++)
				fact=fact*i;
			}
			public void showData()
			{
				System.out.println("Number is "+num);
				System.out.println("Factorial of number is "+fact);
			}
		
			public static void main(String[] args) {
			// TODO Auto-generated method stub
			Factorial f=new Factorial();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number to Find Factorial");
			int n=sc.nextInt();
			f.setData(n);
			f.findFact();
			f.showData();
	}

}
