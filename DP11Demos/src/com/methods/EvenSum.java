// WAP to find sum of all even numbers between 1 to n.


package com.methods;
import java.util.Scanner;
public class EvenSum {
	
		    static int fun(int n)  
		    {  
		        int i, sum = 0;  
		        for (i = 2; i <= n; i+=2) {  
		            sum += i;  
		        }  
		        return sum;   
		    }  
		    public static void main(String argc[])  
		    {  
		        System.out.println("Enter any number: ");  
		        Scanner sc = new Scanner(System.in);  
		        int n = sc.nextInt();  
		        System.out.println("Sum of all even numbers from 1 to " + n + " is: " + fun(n));  
		    }  
		  

	}


