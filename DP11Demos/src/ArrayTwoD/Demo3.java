
/*
 * 1 2 3 =>6
 * 2 3 4=> 9
 * 6 7 8=> 21
 * 
 * */
package ArrayTwoD;
import java.util.Scanner;
import java.util.Arrays;
public class Demo3 {
	
	public static void setData(int [] [] arr)
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println("Please Enter the Elements:");
			int ele=sc.nextInt();
			arr[i][j]=ele;

		}
	}
}
		public static void display(int a[][])
		{
		for(int i=0;i<a.length;i++)
			{
				System.out.println(Arrays.toString(a[i]));
			}
		}
		public static void addArrays(int arr[][])
		{
			int rsum=0;
			for(int i=0;i<arr.length;i++)
			{
				
				for(int j=0;j<arr[i].length;j++)
				{
				rsum=rsum+arr[i][j];
				}
				System.out.println("Sum of all Elements in rows "+rsum);
			}
		}
			public static void addColArrays(int arr1[][])
			{
				int i=0;
				for(int j=0;j<arr1[0].length;j++)
				
				{
					int csum=0;
					for( i=0;i<arr1.length;i++)
					{
					csum=csum+arr1[i][j];
					}
					System.out.println("Sum of all Elements in columns "+csum);
					
				}
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][3];
		Demo3.setData(a);
		Demo3.display(a);
		Demo3.addArrays(a);
		Demo3.addColArrays(a);
	}

}
