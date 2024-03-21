package com.ExceptionHandling;

import java.util.Arrays;
public class MultiCatches {

		public static void show()
		{
				int arr[]= {1,2,3,4,5,6,7};
				arr[6]=10;
				String str="Null";
				System.out.println(str.length());
				System.out.println(Arrays.toString(arr));
				System.out.println("Method ends");
			}
			
		
			
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Main Starts ");
			try {
				show();
			}
			catch(ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException  ex)
			{
				ex.printStackTrace();
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("Method Ends ");
	
	}

}
