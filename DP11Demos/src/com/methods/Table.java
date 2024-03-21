//12. print the table of given number
package com.methods;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int i,n,t=0;
	        Scanner sc = new Scanner(System.in);  
	      
	        System.out.println("Enter the number");  
	        n = sc.nextInt();  
	   
		for(i=1;i<=10;i++)
		{
			t=n*i;
			System.out.println(t);
		}
	}
		
}
