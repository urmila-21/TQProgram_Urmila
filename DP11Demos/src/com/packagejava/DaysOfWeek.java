package com.packagejava;
import java.util.Scanner;
public class DaysOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number:");
		num=sc.nextInt();
		if(num==1)
		{
			System.out.println("The day is Monday");
		}
		else 
			if(num==2)
			{
				System.out.println("The day is Tuesday");
			}
			else 
				if(num==3)
				{
					System.out.println("The day is Wednesday");
				}
				else 
					if(num==4)
					{
						System.out.println("The day is Thursday");
					}
						else 
							if(num==5)
							{
								System.out.println("The day is Friday");
							}	
							else 
								if(num==6)
								{
									System.out.println("The day is saturday");
								}
								else 
									if(num==7)
									{
										System.out.println("The day is Sunday");
									}	
									else
										if(num==8)
									{
										System.out.println("The day is not find");
									}
								
	}

}
