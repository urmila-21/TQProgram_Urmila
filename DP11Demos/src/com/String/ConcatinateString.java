package com.String;

public class ConcatinateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Hello";
		String str2="World";
		String str3="Hello";
		String str4="hello";
		
			System.out.println("Concatinate "+str.concat(str2));// HelloWorld
			
			System.out.println("Compare Strings str and str3 : "+str.compareTo(str3));// 0 compare ascii value
			
			System.out.println("Compare Ignore case of str and str4 :"+str.compareToIgnoreCase(str4));//output : 0
			
			System.out.println("Compare Ignore case of str and str2 :"+str.compareToIgnoreCase(str2));// -15
			
			System.out.println("str is Ends with o :"+str.endsWith("o"));
			
			System.out.println("Index of o in str :"+str.indexOf('o'));// values of str is present in str or not
			
			System.out.println("Index of Ch :"+str.indexOf('l',0));
			
			System.out.println("Last Index of str and str4 :"+str.lastIndexOf(str3));
			
			System.out.println("last index of char str :"+str.lastIndexOf('H', 0));
			
			System.out.println();
			
	}
	

}
