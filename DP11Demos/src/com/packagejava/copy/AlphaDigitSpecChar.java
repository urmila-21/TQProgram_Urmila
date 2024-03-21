package com.packagejava.copy;
import java.util.Scanner;
public class AlphaDigitSpecChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Any character:");
		ch=sc.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println("The Character is an Alphabet");
		}
		else
			if((ch>='0') && (ch<='9'))
		{
			System.out.println("The Character is Digit");
		}
		else
		{
			System.out.println("The Character is Special Character");
		}
	}
}
