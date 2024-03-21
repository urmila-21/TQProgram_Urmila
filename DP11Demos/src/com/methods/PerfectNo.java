package com.methods;

import java.util.Scanner;

public class PerfectNo {
		
			public void perfect(int num)
			{
				int sum=0;
						//num=1;
				for(int i=1;i<=num/2;i++)
				{
					if(num%i==0)
						sum=sum+i;
				}
				
				if(sum==num)
				{
					System.out.println("The number is perfect "+num);
				}else
				{
					System.out.println("The number is not perfect "+num);
				
				}
			}
			
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PerfectNo obj = new PerfectNo();
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			System.out.println("enter the number ");
			obj.perfect(num);
			
			
			
	}

}
