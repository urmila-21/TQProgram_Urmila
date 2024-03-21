//Print table from 1 to 10
package com.methods;

import java.util.Scanner;

public class TableForEach {
	
	public void printTable()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//TableForEach obj = New TableForEach();
			TableForEach obj=new TableForEach();
			Scanner sc=new Scanner(System.in);
			System.out.println("Tables from 1 to 10 are:");
	        obj.printTable();
	}

}
