package com.packagejava.copy;

public class ForAddAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		double avg=0;
		for(i=0;i<=10;i++)
		{
			sum=sum+i;
			avg=sum/10;
			System.out.println("Sum is "+sum+"\n");
			System.out.println("Average is "+avg);
		}
	}

}
