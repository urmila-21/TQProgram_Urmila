/*
 * Print the Series

 * 1,2,4,7,11,16,22,29...
 * Logic is:
 * 1+0=1
 * 1+1=2
 * 2+2=4
 * 4+3=7
 * 7+4=11
 * 11+5=16
 * 16+6=22
 * 
 * */
package com.forloopackage;

import java.util.Scanner;

public class MethodAdd {
	
		public int addSeries(int res)
		{
			int num=1,cnt=0;
				num=num+cnt;
				cnt=cnt+1;
			return res;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				MethodAdd obj = new MethodAdd();
				int res= obj.addSeries(8);
				System.out.println(" "+res);
				
				Scanner sc= new Scanner(System.in);
				System.out.println("How many terms of series Do you want");
				int term=sc.nextInt();
				
				for(int i=1;i<=term;i++)
				{
					res=obj.addSeries(i);
					System.out.print(res+ " ");
				}
	}

}
