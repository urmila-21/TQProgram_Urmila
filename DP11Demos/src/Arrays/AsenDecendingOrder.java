package Arrays;

import java.util.Arrays;

public class AsenDecendingOrder {

	public static void sortArray(int arr[])
	{
		int j=0,temp=0;
		for(int i=0;i<arr.length;i++)
		{
		for(j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				System.out.println(arr[i]);
			}
			System.out.println(Arrays.toString(arr));}}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {15,1,9,3};
		System.out.println("Array 1");
		System.out.println(Arrays.toString(num));
		System.out.println("Array after sorting");
		System.out.println(Arrays.toString(num));
		AsenDecendingOrder.sortArray(num);
		
		
	}

}
