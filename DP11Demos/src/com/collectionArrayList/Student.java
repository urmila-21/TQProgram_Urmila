package com.collectionArrayList;
import java.lang.Package;
import java.util.ArrayList;
import java.util.Iterator;

public class Student { 
		
		private int id;
		private String name,grade;
		private ArrayList<Double> marks = new ArrayList<Double>();
		private double percentage;
		Student()
		{
			
		}
		Student(int id,String name,ArrayList<Double> marks)
		{
			super();
			this.id=id;
			this.name=name;
			this.marks=marks;
			calculatePercent();
			calculateGrade();
		}
		public void calculatePercent() {
			// TODO Auto-generated method stub
			int sum=0;
			int percentage=0;
			ArrayList<Double> marks = new ArrayList<Double>();
			marks.add(50.9);
			marks.add(50.9);
			marks.add(50.9);
			System.out.println(marks);
			//System.out.println(sum=);
		}
		
		public void calculateGrade() {
			// TODO Auto-generated method stub
			
		}
		
		public void setId(int id)
		{
			this.id=id;
		}
		public int getId()
		{
			return id;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		
		public String getName()
		{
			return name;
		}
		
		public ArrayList<Double> getMarks() {
			return (ArrayList<Double>) marks;
		}
		public void setMarks(ArrayList<Double>  marks) {
			this.marks = (ArrayList<Double>) marks;
		}
		
		public void setPercent(double percentage)
		{
			this.percentage=percentage;
		}
		
		public void setGrade(String grade)
		{
			this.grade=grade;
		}
		
		public String toString()
		{
			return " Id : "+id+" Name of Student : "+name+" Marks : "+marks+" Percentage : "+percentage+" Grade : "+grade;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student s=new Student();
			ArrayList<Double> ar=new ArrayList<Double>();
			s.id=1;
			s.name="Urmila";
			s.calculatePercent();
			System.out.println(s);
					
		}
			public int compareTo(Student o) {
				// TODO Auto-generated method stub
				System.out.println("I am in compare");
				if(this.id>o.id)
					return 1;
				else if(this.id<o.id)
					return -1;
				else	
					return 0;
			}
		}

	
