package com.oops;

public class Account {

		private int accNo;
		private String ownerName;
		private double balance;
		
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
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		}

}
