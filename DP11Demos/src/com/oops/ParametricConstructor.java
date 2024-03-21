package com.oops;

public class ParametricConstructor {

	private int accNo;
	private String ownerName;
	private double balance;
	
	ParametricConstructor(int accNo,String ownerName,double balance )
	{
		System.out.println("This is Paramertic Constructor ");
		accNo=12345;
		ownerName="Urmila";
		balance=600000;
		
	}
	
	public void setAcc(int ac)
	{
		 accNo=ac;
	}
	public int getAcc()
	{
		return accNo;
	}
	
	public void setOwnerName(String name)
	{
		ownerName=name;
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	public void setBalance(int bal)
	{
		balance=bal;
	}
	
	public double getBalance()
	{
		return balance;
	}
	public void show()
	{
		System.out.println("Account No : "+accNo+"\n Owner Name : "+ownerName+"\n Balance : "+balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametricConstructor obj;
		obj=new ParametricConstructor(12344,"Urmila",98766);
		
		
		obj.show();
		obj.setAcc(345677);
		obj.getAcc();
		obj.setOwnerName("abc");
		obj.setBalance(2000);
		obj.getOwnerName();
		obj.show();
		
	}

	
}
