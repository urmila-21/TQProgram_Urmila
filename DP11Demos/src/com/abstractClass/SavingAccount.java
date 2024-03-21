package com.abstractClass;

public class SavingAccount extends Account{

	double interestrate;
	SavingAccount()
	{
		
	}
	SavingAccount(int accno,int id,String name,String email,double balance,int phoneno,double interestrate)
	{
		super(accno,id,name,email,balance,phoneno);
		this.interestrate=interestrate;
	}
	
	
	public  double calculateInterest()
	{
		return interestrate=balance*interestrate/100;
	}
	public String toString()
	{
		return super.toString()+"\nRate of Interest :"+interestrate;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account sa= new SavingAccount();
		System.out.println(sa);
		
		Account a= new SavingAccount(123456,21,"abc","abc@gmail.com",20000,223211233,6);
		
		System.out.println(a);
		a.deposite(2000);
		a.withdraw(1000);
		System.out.println("After Interest Rate "+a.calculateInterest());
	}

}
