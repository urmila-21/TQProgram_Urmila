package com.packagejava.copy;
import java.util.Scanner;
public class AvgOf3Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,sum,avg;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value:");
		a=sc.nextInt();
		System.out.println("Enter the 2nd value:");
		b=sc.nextInt();
		System.out.println("Enter the 3rd value:");
		c=sc.nextInt();
		sum=a+b+c;
		System.out.println("The Sum is "+sum);
		avg=sum/3;
		System.out.println("The Average of 3 numbers is "+avg);

	}

}
