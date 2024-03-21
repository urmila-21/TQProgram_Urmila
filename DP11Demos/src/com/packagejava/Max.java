package com.packagejava;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X");
		x= sc.nextInt();
		System.out.println("Enter the value of Y");
		y= sc.nextInt();
		if(x<y)
			System.out.println(" Value of Y = "+y+ " is Maximum.");
		 else 
			System.out.println(" Value of X = "+x+ " is Maximum.");
	}

}
