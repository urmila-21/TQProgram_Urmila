package com.packagejava;
import java.util.Scanner;
public class DigitNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the digit");
		digit=sc.nextInt();
		
		if(digit>=0 && digit<=9)
		{
			System.out.println(digit+ " is a single Digit Number");
		}
		else
			if(digit>=10 && digit<=99)	
			{
				System.out.println(digit+ " is a two Digit Number");
			}
			else
				if(digit>=100 && digit<=999)
				{
					System.out.println(digit+ " is a three Digit Number");
				}
	}

}
