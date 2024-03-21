package com.queue;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	private double percent;
	
	Student()
	{
		
	}
	Student(int id,String name,double percent)
	{
		this.id=id;
		this.name=name;
		this.percent=percent;
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
	public double getMarks() {
		return percent;
	}
	public void setMarks(double percent) {
		this.percent = percent;
	}
	
	
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", percent=" + percent + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.percent==o.percent)
		return 0;
		else if(this.percent>o.percent)
			return 1;
		else
			 return -1;
	}

}
