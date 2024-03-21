package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayDemo {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	int numArr[]=new int[5];
	
	System.out.println("Array length is "+numArr.length);
		for(int i=0;i<numArr.length;i++)
	{
		System.out.println(numArr[i]);
	}
		
		
	numArr[0]=11;
	numArr[1]=12;
	numArr[2]=13;
	numArr[3]=14;
	numArr[4]=15;
	
	System.out.println(Arrays.toString(numArr));
	
	Scanner sc= new Scanner(System.in);
	for(int i=0;i<numArr.length;i++)
	{
		System.out.println("Enter the "+(i+1)+"elements");
		int ele=sc.nextInt();
		numArr[i]=ele;
	}
	System.out.println(Arrays.toString(numArr));
	
   }

}
