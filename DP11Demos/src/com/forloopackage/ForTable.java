package com.forloopackage;
import java.util.Scanner;
public class ForTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,i,res;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		no=sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			res=i*no;
			System.out.println(+no+"*"+i+"=" +res);
		}
	}

}
