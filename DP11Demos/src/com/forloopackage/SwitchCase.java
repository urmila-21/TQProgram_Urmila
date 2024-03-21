package com.forloopackage;
import java.util.Scanner;

public class SwitchCase {
	
		public int switchcase(int num)
		{
		
			switch(num)
			{
			case 1: System.out.println("Monday");
					break;
			case 2: System.out.println("Tuesday");
					break;
			case 3: System.out.println("Wednesday");
					break;
			case 4: System.out.println("Thursday");
					break;
			case 5: System.out.println("Friday");
					break;
			case 6: System.out.println("Saturday");
					break;
			case 7: System.out.println("Sunday");
					break;
			default:System.out.println("Error! The day is does not exist");
					break;
			}return num;
			
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				SwitchCase obj=new SwitchCase();
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the day Number (1-7):");
				int num=sc.nextInt();
				int res=obj.switchcase(num);
				System.out.println(res+" ");
		       
		       
			}

}
