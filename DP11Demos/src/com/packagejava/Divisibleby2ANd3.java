package com.packagejava;
import java.util.Scanner;
public class Divisibleby2ANd3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num= sc.nextInt();
	
		if(num%2==0 && num%3==0)
		{
			System.out.println("the number is divisible by 2 and 3 is " +num);
		}
		else
		{
			System.out.println("the number is not divisible by 2 and 3\n the number is " +num);
		}

	}

}
