package com.packagejava;
import java.util.Scanner;
public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the 1st Number");
		num1=sc.nextInt();
		System.out.println("Please Enter the 2st Number");
		num2=sc.nextInt();
		System.out.println("Please Enter the 3st Number");
		num3=sc.nextInt();
		
		if((num1>=num2 && num1<=num3) || (num1>=num3 && num1<=num2))
		{
			System.out.println("The Second Maximum Number is "+num1);
		}
		else
			if((num2<=num1 && num2>=num3) || (num2<=num3) && (num2>=num1))
		{
			System.out.println("The Second Maximum Number is "+num2);
		}
			else
				if((num3>=num1 && num3<=num2) || (num3<=num2) && (num3>=num1))
			{
				System.out.println("The Second Maximum Number is "+num3);
			}
	
	}
}

