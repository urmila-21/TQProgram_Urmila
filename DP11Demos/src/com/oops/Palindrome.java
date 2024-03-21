package com.oops;
import java.util.Scanner;
	public class Palindrome {
	
		int num,sum=0,digit;
		public int setData(int n)
		{
			 num=n;
			 return num;
		}
		public void findPalindrome()
		{
			for(int i=num;i>0;i=i/10)
			{
				digit=i%10;
				sum=sum*10+digit;
			}
		}
		public void showData()
		{
			if(sum==num)
			System.out.println("The Number is Palindrome");
			else
			System.out.println("The Number is not Palindrome");	
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Palindrome p=new Palindrome();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value to find Palindrome of Number");
			int n=sc.nextInt();
			p.setData(n);
			p.findPalindrome();
			p.showData();
			
		}
	
	}
