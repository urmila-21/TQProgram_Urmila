package ArrayTwoD;

import java.util.Arrays;

public class MatrixAddition {

	public static int[][] maddition(int arr[][], int arr2[][]) {
		int arr3[][] = new int[3][2];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr3[i][j] = arr[i][j] + arr2[i][j];
			}
		}
		return arr3;
	}

	public static void display(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int arr2[][] = { { 1, 2 }, { 4, 5 }, { 3, 4 } };
		int arr[][] = new int[3][2];
		arr=MatrixAddition.maddition(arr1, arr2);
		MatrixAddition.display(arr);

	}

}
