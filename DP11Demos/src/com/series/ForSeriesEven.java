/*Take even numbers from User
 * E,g
 * How many Even numbers Do You want to print?
 * 4
 * O/P:2,4,6,8
 * 
 * */


package com.series;
import java.util.Scanner;
public class ForSeriesEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,res;
		Scanner sc= new Scanner(System.in);
		System.out.println("How many Even numbers Do You want to print??");
		num=sc.nextInt();
		
			for(i=1;i<=num;i++)
			{	
				res=i*2;
				System.out.println(i+ ":" +res);
				
			}
	}
}


