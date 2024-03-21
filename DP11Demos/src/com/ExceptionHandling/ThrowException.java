package com.ExceptionHandling;

public class ThrowException {

	public static void show(int a[],int pos)
	{
		if(pos>=0 ||pos<=a.length-1)
		{
			throw new ArrayIndexOutOfBoundsException((pos-1)+" Index is out of bound");
		}
		else
			System.out.println(a[pos-1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int p=7;
		try
		{
			show(arr,p);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
