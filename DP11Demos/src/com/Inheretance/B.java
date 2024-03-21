package com.Inheretance;

public class B extends A{
int j;
		B()
		{
			super(111);
			System.out.println("I am in B()");
			j=20;
		}
		B(int j)
		{
			
			System.out.println("I am in B(int )");
			this.j=j;
		}
		public void show()
		{
			System.out.println(i);
			System.out.println(j);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj= new B();
		obj.show();
	}

}
