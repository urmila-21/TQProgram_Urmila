package com.packagejava.copy;
import java.util.Scanner;
public class ForPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exp,base,i;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value exp");
		exp=sc.nextInt();
		System.out.println("Enter the value base");
		base=sc.nextInt();
		
		
		for(i=1;i<=exp;i++)
		{
			i=i*base;
				System.out.println(i);
		}

	}

}
