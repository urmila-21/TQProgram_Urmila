package com.methods;
import java.util.Scanner;
public class ArmstrongNo {

	public int power(int base,int exp)
	{
		int p=1;
		for(int i=1; i<=exp; i++)
			p=p*base;
		return p;
	}
	public boolean checkNum(int num)
	{
		int sum=0;
		int p=0;
		for(int i=num; i>0; i=i/10)
		{
			int digit=i%10;
			p=power(digit,3);
			System.out.println(p);
			sum=sum+p;
		}
		if(sum==num)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNo obj=new ArmstrongNo();
		boolean f=obj.checkNum(123);
		if(f)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not Armstrong");
	
	}

}
