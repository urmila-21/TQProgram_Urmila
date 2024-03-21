package com.ExceptionHandling;

public class Finallycode {

	public static void show()
	{
		try
		{
			System.out.println("I am try");
			int num=4/0;
			System.out.println(num);
		}
		finally
		{
			System.out.println("I am in finally block");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in main");
		Finallycode f=new Finallycode();
		//try {
			f.show();
		//}
			
		/*	catch(ArithmeticException e)
			{
				System.out.println(e);
			}*/
			
			System.out.println("Method ends");
		
	}

}
