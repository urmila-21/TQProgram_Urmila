// WAP to find sum of all Odd numbers between 1 to n.

package com.methods;
import java.util.Scanner;

		public class OddSum {
			
			    static int fun(int n)  
			    {  
			        int i, oddsum = 0;  
			        for(i = 1; i <= n; i++) {
			        	if(i%2!=0)
			        	{
			        		oddsum =oddsum+i;
			        	}
			        }  
			        return oddsum;   
			    }  
		    public static void main(String argc[])  
		    {  
		        System.out.println("Enter any number: ");  
		        Scanner sc = new Scanner(System.in);  
		        int n = sc.nextInt();  
		        System.out.println("Sum of all Odd numbers from 1 to " + n + " is: " + fun(n));  
		    }  
		  
}
