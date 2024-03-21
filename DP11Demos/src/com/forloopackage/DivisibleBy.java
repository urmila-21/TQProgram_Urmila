package com.forloopackage;

public class DivisibleBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		for(num=1;num<=50;num++)
		{
			if((num %3==0) && (num %5==0))
			{
				System.out.println("Bye");
			}
				else if(num %5==0)
					{
						System.out.println("Welcome");
					}
					else if(num %3==0)
					{
						System.out.println("Hello");
					}
						else
						{
							System.out.println(num);
						}
					
		}
	}

}
