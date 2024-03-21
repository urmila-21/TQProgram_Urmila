package com.packagejava.copy;
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r= 30.5, p=3.14,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius");
		r=sc.nextDouble();
		area=r*r*p;
		System.out.println("Area of Circle is "+area);

	}

}
