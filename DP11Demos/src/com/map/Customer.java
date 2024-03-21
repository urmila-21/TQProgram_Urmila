package com.map;

import java.util.Objects;

public class Customer {

	private int custid;
	private String name,address,email;
	private long contactno;
	private double value;
	
	Customer()
	{
		
	}
	Customer(int custid,String name,String address, String email,long contactno)
	{
		super();
		this.custid=custid;
		this.name=name;
		this.address=address;
		this.email=email;
		this.contactno=contactno;
	}
	
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	
//	
//	@Override
//	public int hashCode() {
//		return (int)name.charAt(0);
//	}
//	
	public int hashCode() {
	int code=(int) (name.length()+value);
	System.out.println(code);
	return code;
	}
	
	public boolean equals(Object o)
	{
		Customer obj= (Customer) o;
		if(this.name.equals(obj.name) && this.address.equals(obj.address) && this.email.equals(obj.email) && this.custid==obj.custid && this.contactno==obj.contactno)
			return true;
		else
			return false;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", contactno=" + contactno + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
