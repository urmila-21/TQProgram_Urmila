package Arrays;

import java.util.Arrays;

public class SummOfArrays {
	
	public static int[] addArrays(int arr[],int arr2[])
	{
		int rarr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			rarr[i]=arr[i]+arr2[i];
		}
		return rarr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,3,4,5};
		System.out.println("Array 1");
		System.out.println(Arrays.toString(num));
		int num1[]= {1,3,3,8,5};
		System.out.println("Array 2");
		System.out.println(Arrays.toString(num1));
		
		int []num3= SummOfArrays.addArrays(num,num1);
		System.out.println("Array after Addition");
		System.out.println(Arrays.toString(num3));
		
		
		
	}

}
