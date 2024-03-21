package com.packagejava;
import java.util.Scanner;
public class MaxOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value");
		num1 = sc.nextInt();
		System.out.println("Enter the 2nd value");
		num2 = sc.nextInt();
		System.out.println("Enter the 3rd value");
		num3= sc.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+ " is the Maximum number ");
		}
			else if(num2>num1 && num2>num3)
			{
				System.out.println(num2+" is the Maximum number ");
			}
				else if(num3>num1 && num3>num2)
				{
					System.out.println("The " +num3+"  is the Maximum number ");
				}
		
	}

}
