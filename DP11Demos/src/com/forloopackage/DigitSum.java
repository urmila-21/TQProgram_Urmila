/*
 * FInd Digit Sum of numbers
 * Example: 897
 * 
 * Please Enter the Number
897
i= 897
i%10 = Digit (7)
Now the sum = 0
Sum + Digit (7)= 7
i= 89
i%10 = Digit (9)
Now the sum = 7
Sum + Digit (9)= 16
i= 8
i%10 = Digit (8)
Now the sum = 16
Sum + Digit (8)= 24
The Final Sum is 24
 * 
 * */

package com.forloopackage;
import java.util.Scanner;
public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter the Number");
		num=sc.nextInt();
		
		int sum=0;
		for(i=num;i>0;i=i/10)
		{
			System.out.println("i= " +i);
			int digit=i%10;
			System.out.println("i%10 = Digit (" +digit+")");
			System.out.println("Now the sum = " +sum);
			sum=sum+digit;
			System.out.println("Sum + Digit ("+digit+")= "+sum);
		}	
		
		System.out.println("The Final Sum is " +sum);
	}

}
