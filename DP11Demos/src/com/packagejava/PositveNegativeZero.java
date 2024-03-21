package com.packagejava;
import java.util.Scanner;
public class PositveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
				if(num<0)
				{
					System.out.println("The Number is Negtive "+num);
				}
				else if(num>0)
				{
					System.out.println("The Number is Positive "+num);
				}
				else if(num==0)
				{
					System.out.println("The Number is Zero "+num);
				}
	}

}
