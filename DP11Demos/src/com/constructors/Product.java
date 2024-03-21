package com.constructors;

public class Product {

	double price,quantity;
	String pname;
	static int pid,count=1;
	static String brandName="TATA";
	
	static
	{
	}	
	
	public Product()
	{
		pid=count;
		count++;
		
	}
	public Product(String pname,double price,double quantity)
	{
		this();
		this.pname=pname;
		this.price=price;
		this.quantity=quantity;
	}
	
	
	public void show()
	{
		System.out.println("Product Id:\t"+pid+"\nBrand Name :\t"+brandName+"\nProduct Name :\t"+pname+"\nPrice : \t"+price+"\nQuantity :\t"+quantity+"\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.show();
		Product p2=new Product("Namak",30,2);
		p2.show();
		Product p3=new Product("Shampoo",100,4);
		p3.show();
		Product p4=new Product("Rice",130,5);
		Product.brandName="Ashirvad";
		p4.show();
		
		
		
	}

}
