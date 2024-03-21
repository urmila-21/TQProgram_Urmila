package com.String;

public class Replacestr{
	
		public static void replace(String str)
		{
			String str1=" ";
	        str1= str.replaceAll("[aeiou]", ""); 
	        System.out.println("String after removing vowel : "+str1);
		}
	
		public static void main(String[] args) {
			
	        String s = "Urmila";
	        Replacestr.replace(s);
		}
	
	}
