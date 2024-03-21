package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DepartmentMap {

			public static void print(HashMap<Integer,Department> map)
			{
				Set<Entry<Integer, Department>> entry=map.entrySet();
				Iterator<Entry<Integer, Department>> itr=entry.iterator();
				while(itr.hasNext())
				{
					Entry<Integer, Department> en=itr.next();
					System.out.println(en.getKey()+" : "+en.getValue());
				} 
			}
			public static void print1(ArrayList<Student> stud)
			{
				Set<Entry<Integer,Department>> entry=((Map<Integer, Department>) stud).entrySet();
				Iterator<Entry<Integer,Department>> itr=entry.iterator();
				while(itr.hasNext())
				{
					Entry<Integer,Department> en=itr.next();
					System.out.println(en.getKey()+" : "+en.getValue());
				} 
			}
			
							
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Department d=new Department();
				
				ArrayList<Student> stud = new ArrayList<Student>();
				stud.add(new Student(1,"Urmila"));
				stud.add(new Student(2,"tina"));
				stud.add(new Student(3,"Rina"));
				stud.add(new Student(4,"mina"));
				
				Department d1=new Department(111,"IT",stud);
				
				ArrayList<Student> stud1= new ArrayList<Student>();
				stud1.add(new Student(5,"Priya"));
				stud1.add(new Student(6,"Riya"));
				stud1.add(new Student(7,"Jiya"));
				stud1.add(new Student(8,"mina"));
				
				Department d2=new Department(121,"Electronics",stud1);
				
				ArrayList<Student> stud2=new ArrayList<Student>();
				stud2.add(new Student(9,"shital"));
				stud2.add(new Student(10,"Shraddha"));
				stud2.add(new Student(11,"Karuna"));
				stud2.add(new Student(12,"Varsha"));
				
				Department d3=new Department(123,"Mechanics",stud2);
				
				ArrayList<Student> stud3 = new ArrayList<Student>();
				stud3.add(new Student(14,"Urmila"));
				stud3.add(new Student(25,"tina"));
				stud3.add(new Student(36,"Rina"));
				stud3.add(new Student(41,"mina"));
				
				Department d4=new Department(124,"Civil",stud3);
				
				HashMap<Integer,Department> map=new HashMap<Integer,Department>();
				map.put(d1.getId(), d1);
				map.put(d2.getId(), d2);
				map.put(d3.getId(), d3);
				map.put(d4.getId(), d4);
				
				print(map);
				print(stud);
				
			}
			private static void print(ArrayList<Student> stud) {
				// TODO Auto-generated method stub
				
			}
		
		}
