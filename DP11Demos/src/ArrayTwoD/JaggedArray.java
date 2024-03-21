package ArrayTwoD;
import java.util.Arrays;
import java.util.Scanner;
public class JaggedArray {

	public static void show(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{10},{20,30},{40,50,60},{70}};
		System.out.println("2 D Jagged Array using first class Syntax ");
		show(arr);
		System.out.println("2 D Jagged array using new Keyword ");
		
		int arr1[][]=new int[4][];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Please enter size of " +(i+1)+ " row");
			int size=sc.nextInt();
			arr1[i]=new int[size];
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.println("Enter the data");
				int ele=sc.nextInt();
				arr1[i][j]=ele;
			}
		}
		show(arr1);
	}

}
