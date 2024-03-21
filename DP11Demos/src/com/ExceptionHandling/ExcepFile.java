package com.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcepFile {

	public void showData() {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("MyFile.txt");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void method() 
	{
		try(FileInputStream fin =new FileInputStream("MyFile.txt"))
		{
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcepFile f= new ExcepFile();
		f.showData();
		f.method();
	}

}
