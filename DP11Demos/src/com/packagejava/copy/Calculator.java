package com.packagejava.copy;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,add,ch=0,sub;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		num1=sc.nextInt();
		System.out.println("Enter the Second number");
		num2=sc.nextInt();
		System.out.println("Enter your Choice \n 1:Addition  2:Substraction" );
	
		ch=sc.nextInt();
		
		
		if(ch==1)
		{
			add=num1+num2;
			System.out.println("The Addition is "+add);
		}else
			if(ch==2)
			{
				sub=num1-num2;
				System.out.println("The Substraction is "+sub);
			}
	}

}
