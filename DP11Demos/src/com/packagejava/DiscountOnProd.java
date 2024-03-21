package com.packagejava;
import java.util.Scanner;
public class DiscountOnProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		double disc,discprice;
		
		System.out.println("Enter the Product price");
		 int prodprice = myObj.nextInt();
		 
		 if(prodprice<=25000)
			{
				discprice=0.05*prodprice;
				//Formula for calculating discounted price is (discount/100)*price
				System.out.println("The discount is 5%");	
				System.out.println("The discounted price is "+discprice);
			} else 
					if(prodprice>25000 && prodprice<=40000)
				{
					discprice=0.10*prodprice;	
					System.out.println("The discount is 10%");
					System.out.println("The discounted price is "+discprice);
				}
				else 
						if(prodprice>40000 && prodprice<=50000)
					{
						discprice=0.12*prodprice;
						System.out.println("The discount is 12%");	
						System.out.println("The discounted price is "+discprice);
					}
					else 
							if(prodprice>50000)
						{
							discprice=0.15*prodprice;
							System.out.println("The discount is 15%");
							System.out.println("The discounted price is "+discprice);
						}
				
		
	}

}
