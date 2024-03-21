package com.ExceptionHandling;

import java.util.Arrays;
public class Demo1 {
		
	public static void show()
	{
		try
		{
			int arr[]= {1,2,3,4,5,6,7};
			arr[6]=10;
			System.out.println(Arrays.toString(arr));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("Method Ends ");
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Starts ");
		show();
	}

}
