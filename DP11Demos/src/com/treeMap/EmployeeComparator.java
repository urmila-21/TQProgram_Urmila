package com.treeMap;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if(o1.getId()==o2.getId())
			return 0;
		else if(o1.getId()<o2.getId())
			return 1;
		else
			return -1;
	}

	
}
