package com.packagejava;
import java.util.Scanner;
public class BloodDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age,hemog,bmi;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter your Age");
		age=sc.nextInt();
		System.out.println("Please Enter the Hemoglobin level");
		hemog=sc.nextInt();
		System.out.println("Please Enter your BMI ");
		bmi=sc.nextInt();
		
		if((age>=18) && (bmi>=20 || bmi<=25 ) && (hemog>=12))
		{
			System.out.println("You are Eligible for Blood Donation");
			
		}
		else
		{	System.out.println("You are Not Eligible for Blood Donation");
			
		}
	}

}
