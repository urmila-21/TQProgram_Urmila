package com.series;

import java.util.Scanner;

public class SquareSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num=0,term;
		Scanner sc= new Scanner(System.in);
		System.out.println("How many number of series Do you want");
		term=sc.nextInt();
		
		for(i=1;i<=term;i++)
		{
			num=i*i;
			System.out.println(num);
		}
		
	}

}
