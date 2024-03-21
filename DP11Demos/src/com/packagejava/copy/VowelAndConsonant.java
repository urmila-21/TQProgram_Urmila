package com.packagejava.copy;
import java.util.Scanner;
public class VowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter any Alphabet");
		ch=sc.next().charAt(0);
		
		if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o')|| (ch=='u')||(ch=='A') || (ch=='E') || (ch=='I') || (ch=='O')|| (ch=='U'))
			System.out.println("The given Alphabet is Vowel");
		else
			System.out.println("The given Alphabet is Consonant");
			
	}

}
