package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void setData(int num[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" element");
			int ele=sc.nextInt();
			num[i]=ele;
	}
		System.out.println();
		System.out.println("Array in Reverse order");
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.print(num[i]+" ");
		}
	}
		
	public static void main(String[] args) {
	
		int arr[]=new int[5];
		ReverseArray.setData(arr);
		System.out.println(Arrays.toString(arr));
	}
}
