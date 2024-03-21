package com.packagejava.copy;
import java.util.Scanner;
public class EvenOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		a = sc.nextInt();
		
			if(a%2==0)
				System.out.println("The number is Even "+a);
			else
				System.out.println("The number is Odd "+a);
	}

}
