/*Write a java program  to split into 2 tokens where string is "HELLOW$WORLD"*/
package com.String;

import java.util.Arrays;

public class SplitStrings {

	public static void splits(String st) {
		char ch[] = st.toCharArray();
		String s1[] = st.split("\\$", 2);
		System.out.println(Arrays.toString(s1));
		System.out.println(s1[0]);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '$') {
				ch[i] = ' ';
			}
		}
		System.out.println(ch);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HELLO$WORLD";
		SplitStrings.splits(str);
	}

}
