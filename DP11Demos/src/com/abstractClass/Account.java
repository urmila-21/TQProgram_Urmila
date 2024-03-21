package com.abstractClass;

public abstract class Account {
	
	int accno,id;
	String name,email;
	double balance;
	int phoneno;
	Account()
	{
		System.out.println("I am in Account()");
		
	}
	Account(int accno,int id,String name,String email,double balance,int phoneno)
	{
		this.accno=accno;
		this.id=id;
		this.name=name;
		this.email=email;
		this.balance=balance;
		this.phoneno=phoneno;
	}
	
	
	public void deposite(int amt)
	{
		balance= balance+amt;
		System.out.println("Balance After Depositing "+balance);
	}
	public void withdraw(int amt)
	{
		if(balance-amt<=0)
		{
			
			System.out.println("Inseficient Balance "+balance);
			
		}else
		{
			balance= balance-amt;
			System.out.println("Balance after withdrawing "+balance);
		}
	}
	
	public String toString()
	{
		return "Account no :"+accno+"\nId :"+id+"\nName :"+name+"\nEmail :"+email+"\nBalance : "+balance+"\nPhone No:"+phoneno;
	}
	public abstract double calculateInterest();
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
