package com.ternaryOperator;

public class TernaryOddEven {

			public void oddEven(int a)
			{
				String str=" ";
				str=(a%2==0)? a+" is even": a+" is odd";
				//return a;
				System.out.println(str);
			}
			
			public void posNeg(int b)
			{
				String str2=" ";
				str2=(b<0)? b+" is Negative": (b>0)? b+" is Positive":"Zero";
				System.out.println(str2);
			}
			
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				TernaryOddEven obj=new TernaryOddEven();
				obj.oddEven(3);
				obj.posNeg(-1);
			}
}
