/*1. WAP which throws ArrayIndexOutBoundsException. In the console, observe the stack trace and the
line number from where the Exception is thrown*/
package com.ExceptionHandling;
import java.util.Arrays;
import java.io.IOException;

public class ArrayIndex {

	public static void arrayExcep(int arr[])
	{
		System.out.println(Arrays.toString(arr));
		System.out.println("Method Ends");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] arr= {1,2,3,4,5,6,7};
			arr[6]=10;
			arrayExcep(arr);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("In Mains");
		//int[] arr = null;
		
	}
	

}
