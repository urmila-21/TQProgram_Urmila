package com.String;
import java.util.Arrays;
public class Annagram {

	public static boolean anngram(char[] str1, char[] str2) {
		boolean flag=false;
		int st=str1.length;
		int st2=str2.length;
		if (st != st2)
		{
			return false;
		}	
		Arrays.sort(str1);
		Arrays.sort(str2);		
		for(int i=0;i<st;i++)
		{
			if(str1[i]!=str2[i])
			{
				return false;
			}
			
		}return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = {'c','a','r','e'};
		char st2[] = {'a','r','e'};
		Annagram.anngram(str, st2);
	}

}
