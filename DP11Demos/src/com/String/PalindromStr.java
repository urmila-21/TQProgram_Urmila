package com.String;

public class PalindromStr {

	public static void palindrom(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("String is Palindrome :" + str);
		} else {
			System.out.println("String is not palindrome :" + str);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Jayashree";
		PalindromStr.palindrom(s1);
	}

}
