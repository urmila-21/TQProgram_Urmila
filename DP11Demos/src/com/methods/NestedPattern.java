package com.methods;

import java.util.Scanner;

public class NestedPattern {
	
		public void patternNested()
		{
			for(int i=1;i<=5;i--)
			{
				System.out.println(i);
				
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+"\t");
				}
				//System.out.println("");
			}
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//TableForEach obj = New TableForEach();
			NestedPattern obj=new NestedPattern();
			Scanner sc=new Scanner(System.in);
			System.out.println("pattern is:");
	        obj.patternNested();
		
	}

}
