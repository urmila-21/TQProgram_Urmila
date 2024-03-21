package Arrays;
import java.util.Arrays;
import java.util.Scanner;


public class SearchArray {

	public static void setData(int num[])
	{
	
	/*	Scanner sc=new Scanner(System.in);
		for(int i=0;i<num.length;i++)
		{
			System.out.println("Enter the  "+(i+1)+" element");
			int ele=sc.nextInt();
			num[i]=ele;
		}*/
		System.out.println("Enter element to search in Array :");
	}
	
	public static void check(int num[],int toCheckValue)
	{
		boolean test=false;
		
		for(int i=0;i<num.length;i++)
		{
			if(i == toCheckValue)
			{
				test=true;
				break;}
		}
		System.out.println("Is "+toCheckValue+" Present in the array? : "+test);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		SearchArray.setData(arr);
		Scanner sc=new Scanner(System.in);
		int toCheckValue =sc.nextInt();
		SearchArray.check(arr,toCheckValue);
		System.out.println(Arrays.toString(arr));
		
	}
}
