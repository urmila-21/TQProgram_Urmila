package com.ExceptionHandling;

public class RunTimePropagation {

	void m()
	{
		int data=50/0;
	}
	void n()
	{
		m();
	}
	void p()
	{
		try {
		n();
		}catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunTimePropagation r= new RunTimePropagation();
		r.p();
		System.out.println("Normal flow");
	}

}
