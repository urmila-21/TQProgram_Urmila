//Assignment Program 4:
//WAP to find GCD and LCM of given number
package com.methods;
import java.util.Scanner;
public class GcdAndLcm {

			static int gcd(int a, int b) { 
				
				// if b=0, a is the GCD 
				if (b == 0) 
					return a; 
				
				// call the gcd() method recursively by 
				// replacing a with b and b with 
				// modulus(a,b) as long as b != 0 
				else
					return gcd(b, a % b); 
			} 

			// lcm() method returns the LCM of a and b 
			static int lcm(int a, int b, int gcdValue) 
			{ 
				return Math.abs(a * b) / gcdValue; 
			} 

			// Driver method 
			public static void main(String[] args) { 

				int  gcdValue; 
				gcdValue = gcd(10, 20); 
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the value of a");
				int a=sc.nextInt();
				System.out.println("Enter the value of b");
				int b=sc.nextInt();
				
				// calling gcd() over 
				System.out.println("GCD = " + gcdValue); 
				
				// calling lcm() over integers 30 and 20 
				System.out.println("LCM = " + lcm(a, b, gcdValue)); 
			} 
		}

	


