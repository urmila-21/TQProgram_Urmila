/*
 * 
 * 
 * */


package com.forloopackage;
import java.util.Scanner;
public class DivisibleBySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,digit=0,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter the Number");
		int num=sc.nextInt();
		
			for(i=num;i>0;i=i/10)
			{
				digit=i%10;
				//System.out.println("Digit" +digit);
				sum=sum+digit;
				//System.out.println("Sum" +sum);
				
			}
			
	}
}
