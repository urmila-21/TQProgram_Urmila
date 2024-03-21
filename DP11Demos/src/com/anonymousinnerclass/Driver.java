package com.anonymousinnerclass;

public class Driver {

	String name;
	String email;
	public String number;

	Driver() {

	}

	public Driver(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void drive() {
		System.out.println("I am in drive() ");
	}

	public String toString() {
		return "Name " + name + " Email " + email;
	}

	public class Outer {
		// Anonymous Inner class

		Driver obj = new Driver("Urmila", "urmi@gmail.com");
	
		{
			int number;
			{
				number=1234522;
			}
		}
			public void drive()
			{
				System.out.println("I am in drive method of annonymous inner class");
				newMethod();
			}
			public String toString()
			{
				return super.toString() +" "+number;
			}
			public void newMethod()
			{
				System.out.println("I am in new method of annonymous class");
			}
		public void show() {
			obj.drive();
			System.out.println(obj);
		}
	};

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Driver o = new Driver();
			o.drive();
		}

	}
