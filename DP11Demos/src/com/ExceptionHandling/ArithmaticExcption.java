package com.ExceptionHandling;

import java.util.Scanner;

public class ArithmaticExcption {

	public static void arithmatic(int n, int n2) {

		int res = 0, res2 = 0, res3 = 0, res4 = 0;
		
		System.out.println("Addition is:");
		res = n + n2;
		System.out.println(res);

		System.out.println("Substraction is:");
		res2 = n - n2;
		System.out.println(res2);

		System.out.println("Multiplication is:");
		res3 = n * n2;
		System.out.println(res3);
		try {

			System.out.println("division is:");
			res4 = n / n2;
			System.out.println(res4);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("Method Ends ");

	}

	private void printStackTrace() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number ");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2nd number ");
		int n2 = sc.nextInt();
		ArithmaticExcption.arithmatic(n1, n2);

	}

}
