package com.ternaryOperator;

public class TernaryOP {
	
			public void findMax(int n1,int n2)
			{
				int max=0;
				max=(n1>n2)?n1:n2;
				//return max; if int type
				String str=" ";
				str=(n1>n2)?n1+" is max":n2+" is max";
				System.out.println(str);
				
				
			}
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				TernaryOP obj=new TernaryOP();
				obj.findMax(23,40);
				
			}

}
