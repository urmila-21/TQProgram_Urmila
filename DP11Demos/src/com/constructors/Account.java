package com.constructors;

public class Account {

	int accNo;
	double balance;
	String cname;
	static double interestRate=0.10;
	
	Account()
	{
		
	}
	
	Account(int accNo,double balance,String cname)
	{
		this.accNo=accNo;
		this.balance=balance;
		this.cname=cname;
		
	}	
	
	public static void setInterest(double intRate)
	{
		interestRate=intRate;
		
	}
	public double getInterest()
	{
		
		return interestRate;
	}
	public void CalculateInterest()
	 
	{
		interestRate =balance*interestRate/100;
	}
	public void show()
	{
		System.out.println(" Account No :\t"+accNo+"\n Balance :\t"+balance+"\n Interest Rate :"+interestRate+"\n Customer Name :"+cname+"\n");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		a.show();
		Account a2=new Account(1234567,20000.33,"Urmila");
		a2.show();
	}

}
