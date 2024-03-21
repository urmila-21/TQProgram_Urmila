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
package com.series;
import java.util.Scanner;
public class AddSeries {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int num=1;
			Scanner sc= new Scanner(System.in);
			System.out.println("How many terms of series Do you want");
			int term=sc.nextInt();
			
			int cnt=0;
			for(int i=1;i<=term;i++)
			{
				num=num+cnt;
				cnt=cnt+1;
				System.out.println(num);
			}

		}
}
