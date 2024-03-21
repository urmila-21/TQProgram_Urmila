package com.methods;

import java.util.Scanner;

public class PaternFor {

	
		public void pattern()
		{
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+"\t");
				}
				System.out.println("");
			}
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//TableForEach obj = New TableForEach();
			PaternFor obj=new PaternFor();
			Scanner sc=new Scanner(System.in);
			System.out.println("pattern is:");
	        obj.pattern();
		
	}

}
