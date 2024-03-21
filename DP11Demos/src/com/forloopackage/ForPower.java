package com.forloopackage;

import java.util.Scanner;

public class ForPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exp,base,power=1,i;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value exp");
		exp=sc.nextInt();
		System.out.println("Enter the value base");
		base=sc.nextInt();
		
		
		for(i=1;i<=exp;i++)
		{
			power=power*base;
				System.out.println(i+ " power of "+base+ " is "+power);
		}

	}

}
