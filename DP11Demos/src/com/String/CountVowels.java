package com.String;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java Progrmming";
		System.out.println(str.length());
		
		char ch=str.charAt(2);
		System.out.println(ch);
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u' )
			{
				count++;
				
			}
		}
		System.out.println("Vowels are "+count);
	}

}
