package com.packagejava.copy;
import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base,height,area=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Base of Triangle =");
		base=sc.nextDouble();
		System.out.println("Enter the height of Triangle =");
		height=sc.nextDouble();
		area=(0.5)*base*height;
		System.out.println("The Area Of the Triangle is "+area);
	}

}
