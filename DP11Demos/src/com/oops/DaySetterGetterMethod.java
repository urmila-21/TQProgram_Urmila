package com.oops;

public class DaySetterGetterMethod {
	
	private int dd,mm,yy;
	
	public void setDd(int d)
	{
		dd=d;
	}
	public int getDd()
	{
		return dd;
	}
	
	public void setMm(int m)
	{
		mm=m;
	}
	
	public int getMm()
	{
		return mm;
	}
	public void setYy(int y)
	{
		yy=y;
	}
	
	public int getYy()
	{
		return yy;
	}
	
	public void show()
	{
		System.out.println("Date is "+dd+" /"+mm+" /"+yy);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaySetterGetterMethod obj;
		obj=new DaySetterGetterMethod();
		obj.dd=5;
		obj.mm=2;
		obj.yy=2024;
		obj.show();
	}

}
