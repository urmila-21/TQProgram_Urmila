package com.packagejava;

public class UnaryProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=5;
		int x= ++a + b++;
		System.out.println(x+" "+a+" "+" "+b);
		x= a++ - --b;
		System.out.println(x+" "+a+" "+" "+b);
		x= --a - --b;
		System.out.println(x+" "+a+" "+" "+b);
		x= a++ +b-- +a;
		System.out.println(x+" "+a+" "+" "+b);
		x=++a - ++b;
		System.out.println(x+" "+a+" "+" "+b);
		
		
	}

}
