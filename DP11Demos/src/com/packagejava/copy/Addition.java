package com.packagejava.copy;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the value of a =");
		a=sc.nextInt();
		System.out.println("ENter the value of b =");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("The Sum is " +sum);
	}

}
