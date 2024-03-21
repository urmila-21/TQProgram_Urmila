package com.series;
import java.util.Scanner;
public class PowerSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number");
		no=sc.nextInt();
		
		for (int i = 2; i <= no/ 2; ++i)
		{
			if(no%2==0)
			{
				System.out.println("The Number is not Prime Number");
			}
				else
				{
					System.out.println("The Number is Prime Number");
				}
		}
}
}