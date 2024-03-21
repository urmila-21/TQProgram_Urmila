package com.oops;

public class Datethis {

	private int dd,mm,yy;
	Datethis(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void addDate(Datethis obj)
	{
		int d1=this.dd+obj.dd;
		int m1=this.mm+obj.mm;
		int y1=this.yy+obj.yy;
		System.out.println(d1+"/"+m1+"/"+y1);
	}
	
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
		Datethis obj=new Datethis(5,2,24);
		Datethis obj2=new Datethis(6,2,24);
		obj.show();
		obj2.show();
		System.out.println("Date Addition is ");
		obj.addDate(obj2);
	}

}
