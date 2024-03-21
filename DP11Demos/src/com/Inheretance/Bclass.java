package com.Inheretance;

public class Bclass {

	
	 Bclass(int b) {
		
		System.out.println("1");
		
		}
}
	 class Aclass extends Bclass
	 {
		 int a;
		 Aclass(int a,int b)
		 {
			 super(b);
			 System.out.println("2");
		 }
	 }
	class C extends Aclass
	{
			 int c;
			 C(int a,int b,int c)
			 {
				super(a,b);
				 System.out.println("3");
			 }
	}
	
	class D extends C
	{
		int d;
		D(int a,int b,int c,int d)
		{
			super(a,b,c);
			System.out.println("4");
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
