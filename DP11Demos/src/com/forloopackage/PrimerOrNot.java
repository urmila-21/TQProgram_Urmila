package com.forloopackage;
import java.util.Scanner;


	public class PrimerOrNot{   
		
		static void checkPrime(int n){  
			
		  int i,m=0,flag=0;      
		  m=n/2;      
			  if(n==0||n==1)
			  {  
			   flag=1;      
			  }
			  else
		  	{  
			   for(i=2;i<=m;i++)
			   	{      
				   if(n%i==0)
			    {      
			    	 System.out.println(n+" is not prime number");      
			         flag=1;      
			         break;      
			  }      
			}      
		       if(flag==0)  
		       { 
		    	   System.out.println(n+" is prime number");
		       }  
		  }  
    }  
    
		public static void main(String args[]){    
			PrimerOrNot obj=new PrimerOrNot();
			
		    System.out.println("Enter any number: ");  
		    Scanner sc = new Scanner(System.in);  
		    int n = sc.nextInt();  
		   obj.checkPrime(n);
}  
}   