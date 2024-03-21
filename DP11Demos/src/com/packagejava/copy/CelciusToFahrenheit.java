package com.packagejava.copy;
import java.util.Scanner;
public class CelciusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c, fahrenheit=0.0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Temprature in Celcius");
		c=sc.nextDouble();
		fahrenheit=(c*1.8)+32;
		System.out.println("The Temperature in Fahrenheit is "+fahrenheit);
	}

}
