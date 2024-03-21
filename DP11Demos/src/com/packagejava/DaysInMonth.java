package com.packagejava;
import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		// TODO Auto-generated method
		int month;
		/*January=1,February=2,March=3,April=4,May=5,June=6,July=7,August=8,September=9
				,October=10,November=11,December=12;*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Any Month number from (1:January to 12:December)");
		
		month=sc.nextInt();
	
		
		if(month==1|| month==3 || month==5 || month== 7 || month==8 || month==10 || month==12)
		{
			System.out.println("There are 31 Days in month "+month);
			
		}else
				if( month==4 || month==6 || month== 9 || month==11)
				{
					System.out.println("There are 30 Days in month "+month);
			}else
				
				if(month==2)
				{
					System.out.println("please Enter the year");
					int year=sc.nextInt();
					if((year%4==0) || (year%100==0) || (year%400==0))
						System.out.println("The Days in February "+year+" are 28");
					else
						System.out.println("The Days in February "+year+" are 29");
				
				}
			
	}

}

