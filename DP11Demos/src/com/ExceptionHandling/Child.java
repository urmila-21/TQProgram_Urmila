package com.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent
{
	public void show() throws IOException 
	{
		System.out.println("In Parent show()");
	}

}
public class Child extends Parent{
	
	public void show() throws  FileNotFoundException ,IOException
	{
		super.show();
		System.out.println("In child show()");
	}

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Child c= new Child();
		try {
			c.show();
		}catch(IOException e)
		{
			e.printStackTrace();
		} 
	
	}

}
