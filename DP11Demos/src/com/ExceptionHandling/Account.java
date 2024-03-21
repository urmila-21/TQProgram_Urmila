package com.ExceptionHandling;

import javax.naming.InsufficientResourcesException;

public class Account {

	int accno;
	double balance;
	String name;
	
	Account()
	{
		
	}
	Account(int accNo,String accName,double balance)
	{
		this.accno=accNo;
		this.name=accName;
		this.balance=balance;
	}
	public void deposit(int amt)
	{
		balance=balance+amt;
		System.out.println("After Depositing :\t"+balance+"\n");
	}
	public void withdraw(int amt) throws InsufficientResourcesException
	{
		
		if((balance-amt)>=1000)
		{
			balance=balance-amt;
			System.out.println("Balance after Withdrawing  :"+balance);
		}
		else {
			throw new  InsufficientResourcesException();
			}
	}
	
	public String toString()
	{
		return "Account NO :"+accno+"Name :"+name+"Balance :"+balance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a= new Account(1234567,"Saving",1000);
		try {
			a.deposit(1000);
			a.withdraw(1000);
		}catch(InsufficientResourcesException e)
		{
			System.out.println(e);
		}
	
	}

}
