package Arrays;

import java.util.Arrays;

public class MergeArray {
	
	public static int[] meargeArray(int arr[],int arr2[])
	{
		int arr3[]=new int[arr.length+arr2.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
				arr3[j++]=arr[i];
				arr3[j++]=arr2[i];
			}return arr3;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,3,4,5};
		System.out.println("Array 1");
		System.out.println(Arrays.toString(num));
		int num1[]= {1,3,3,8,5,1,2};
		System.out.println("Array 2");
		System.out.println(Arrays.toString(num1));
		int []num3= meargeArray(num,num1);
		System.out.println("Array after Mearging");
		System.out.println(Arrays.toString(num3));
		
		
	}

}
