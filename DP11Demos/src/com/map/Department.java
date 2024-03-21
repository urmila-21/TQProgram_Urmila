package com.map;

import java.util.ArrayList;

public class Department {
	private int id;
	private String name;
	private ArrayList<Student> stud = new ArrayList<Student>();
	Department()
	{
		
	}
	Department(int id,String name,ArrayList<Student> stud)
	{ 
		this.id=id;
		this.name=name;
		this.stud=stud;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Student> getStud()
	{
		return (ArrayList<Student>) stud;
	}
	
	public void SetStud(ArrayList<Student> stud)
	{
		this.stud=(ArrayList<Student>)stud;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
