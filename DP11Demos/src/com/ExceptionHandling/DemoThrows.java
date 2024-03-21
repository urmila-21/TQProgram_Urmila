package com.ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class DemoThrows {

	public void show() throws IOException
	{
		System.out.println("I am in show ");
		FileInputStream fin=new FileInputStream("MyFile.java");
		
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		DemoThrows obj= new DemoThrows();
		try {
		
		obj.show();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main ends ");
	}

}
