package ArrayTwoD;

public class TwoDArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int arr1[][]= {{1,2},{3,4},{5,6},{7,8}};
	int rarr[]=new int[arr1.length];
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr1[i].length;j++)
		{
			
			System.out.print(arr1[i][j]+"\t");
			int sum=0;
			//rarr[]=arr1[i]+arr1[j];
			System.out.println();
		}
		System.out.println();
	}
	
	}
}