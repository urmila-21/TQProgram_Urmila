package com.collectionArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Employee {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ArrayList<EmpSortName> emparr=new ArrayList<EmpSortName>();
			emparr.add(new EmpSortName(102, 56000, "Anita", "finance"));
			emparr.add(new EmpSortName(106, 34000, "Geeta", "admin"));
			emparr.add(new EmpSortName(110, 68000, "Rahul", "testing"));
			emparr.add(new EmpSortName(109, 61000, "Amar", "develoment"));
			emparr.add(new EmpSortName(104, 55000, "Mnaswi", "marketing"));
			emparr.add(new EmpSortName(107, 46000, "Ruch", "finance"));
			emparr.add(new EmpSortName(112, 76000, "Krishna","developnent"));
			emparr.add(new EmpSortName(104, 86000, "Manoj", "development"));
			
			Iterator<EmpSortName> itr=emparr.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			// 1. Find all employee who are beloning to finance department
			Iterator<EmpSortName> itr1=emparr.iterator();
			System.out.println("Finance dept employee");
			while(itr1.hasNext())
			{
			    EmpSortName e=itr1.next();
			    if(e.getDept().equalsIgnoreCase("finance"))
			    {
			    	System.out.println(e);
			    }
			}
			System.out.println("Before sorting");
			System.out.println(emparr);
			//Collections.sort(emparr);;
			System.out.println("After Sorting");
			System.out.println(emparr); 
		}

	
	}
