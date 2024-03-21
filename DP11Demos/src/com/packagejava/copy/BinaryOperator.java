package com.packagejava.copy;
import java.util.Scanner;
public class BinaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int resulta,results,resultm;
		float resultd;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
		resulta=a+b;
		results=a-b;
		resultm=a*b;
		resultd=(float)a/b;
		System.out.println("The result of adding is "+resulta);
		System.out.println("The result of substracting is "+results);
		System.out.println("The result of multipling is "+resultm);
		System.out.println("the result of dividing is "+resultd);
		
		
		
	}

}
