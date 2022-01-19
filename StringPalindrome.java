package com.pravotosoft;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		String a,b="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check Palindrom or not");
		a=sc.nextLine();
		int length=a.length();
		for(int i=length-1;i>=0;i--)
			b=b+a.charAt(i);
			if(a.equals(b))
				System.out.println("String is Palindrome");
			
			else
				System.out.println("String is not palindrome");
			
			
		}
	

}
