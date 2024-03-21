/*
 * print the a factorial of numbers:
 * 1!,2!,3!,4!,5!,6!...
 * */


package com.forloopackage;
import java.util.Scanner;
	public class Factorial {
		// TODO Auto-generated method stub
		public int findFactorial(int num)
		{
			int fact=1;
			for(int i=1;i<=num;i++)
				fact=fact*i;
			return fact;
		}
		
		public static void main(String[] args) {
			
			Factorial obj = new Factorial();
			int res=obj.findFactorial(7);
			System.out.println("The Factorial is "+res);
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the How many terms o you want to print: ");
			int term=sc.nextInt();
		
			for(int i=1;i<=term;i++)
		{
				res=obj.findFactorial(i);
				System.out.print(res+ " ");

		}
	}
}