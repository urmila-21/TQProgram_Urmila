package com.packagejava.copy;
import java.util.Scanner;
public class FloatingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the floating value for check its Zero or not ");
		f=sc.nextFloat();
		
		if(f==0.000)
		System.out.println("the floating point number is Zero");
		else
			System.out.println("the floating point number is not Zero");
			
		
			}

}
