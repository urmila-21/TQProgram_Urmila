package com.oops;

public class FindPrime {
		
		int num,flag=0,i=2;
		
		public void setData(int n)
		{
			int num=n;
		}
		public void findPrime()
		{
			if(i==1 ||i==0)
			{
				flag=1;
			}
			
		for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
				System.out.println("The Number is not Prime "+num);
				flag=1;
				break;
				}
			}
			if(flag==0)		
			{
				System.out.println("The Number is Prime" +num);
			}
		}
			public void showData()
			{
				if(flag==0)		
				System.out.println("The Number is  Prime "+num);
				else
					System.out.println("The Number is not Prime "+num);	
			}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			FindPrime p=new FindPrime();
			p.setData(8);
			p.findPrime();
			p.showData();
			//System.out.println("The Number is"+n);
			
		}

}
