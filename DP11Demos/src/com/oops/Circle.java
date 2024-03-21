package com.oops;

public class Circle {
	
				double r,area;
				public void setData(double v)
				{
					r=v;
				}
		
				public void calculateArea()
				{
					area=3.14*r*r;
				}
				
				public void showData()
				{
					System.out.println("Radius "+r);
					System.out.println("Area "+area);
				}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
					Circle c=new Circle();
					Circle c1=new Circle();
					c.setData(4.4);
					c.calculateArea();
					c.showData();
					
					c1.setData(1.4);
					c1.calculateArea();
					c1.showData();
					
			}

}
