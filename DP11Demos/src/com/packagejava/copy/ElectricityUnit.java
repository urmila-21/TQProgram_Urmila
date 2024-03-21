package com.packagejava.copy;
import java.util.Scanner;
public class ElectricityUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double unit=0,totalbill=0,bill=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the Units: \n");
		unit=sc.nextDouble();
		if(unit<=50)
		{
			bill=unit*0.50;
		}else
			if(unit<=150)
			{
				bill=(50*0.50)+(unit-50)*0.75;
			}
			else
				if(unit<=250)
				{
					bill=(50*0.50)+(100*0.75)+(unit-150)*1.2;
				}
				else {
						bill=(50*0.50)+(100*0.75)+(100*1.2)+(unit-250)*1.50;
					
						totalbill=bill+bill*0.20;
						System.out.println("The Electricity bill "+bill);
						System.out.println("The total Electricity bill "+totalbill);
	}	}}