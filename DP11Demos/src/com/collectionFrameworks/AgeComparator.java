package com.collectionFrameworks;
import java.util.*;
public class AgeComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		System.out.println("In comparator");
		if(o1==o2)
		{
			return 0;
		}
		else if(o1<o2)
		{
			return 1;
		}
		return -1;
	}
}
