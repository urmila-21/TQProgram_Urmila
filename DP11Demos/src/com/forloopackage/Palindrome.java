/*Palindrome number:
 * Reverse of 121 is 121 its palindrome number
 * 
 * */

package com.forloopackage;

import java.util.Scanner;

		public class Palindrome {
			
			public int findpalindrom(int num)
				{
					int sum=0,digit;
					for(int i=num;i>0;i=i/10)
					{
						digit=i%10;
					    sum=sum*10+digit;
					}
					
					if(sum==num)
						System.out.println("The number is palindrome");
					else
						System.out.println("The number is not palindrome");
					return num;
		}
			public static void main(String[] args) {
				
				Palindrome obj = new Palindrome();
				//int res=obj.findpalindrom(121);
				//System.out.println("The palindrom number is "+res);
			
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Number");
				int num=sc.nextInt();
				
				int res=obj.findpalindrom(num);
				System.out.print(res+ " ");

				
		}
}