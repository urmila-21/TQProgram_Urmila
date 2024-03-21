package com.packagejava;
import java.util.Scanner;
public class SwapOf2Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter 1st value of a");
		a=sc.nextInt();
		System.out.println("Please Enter 2nd value of b");
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("Swapping of two numbers values are a="+a+"\nb=" +b+"\nc= "+c+"\n");

	}

}
