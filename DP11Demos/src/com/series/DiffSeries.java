package com.series;
import java.util.Scanner;
public class DiffSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num=1,term,cnt=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("How many number of series Do you want");
		term=sc.nextInt();
		
		for(i=0;i<=term;i++)
		{
			
			num=num+cnt;
			cnt=cnt+1;
			System.out.println(num);
		}
	}

}
