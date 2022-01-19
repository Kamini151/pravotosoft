package com.pravotosoft;

import java.util.Scanner;

public class RevString {
	public static void main(String[] args) {
		String  str="Kamini";
		String nstr="";
		char ch;
		System.out.println("String to be Reverse :  " +str);
		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("Reverse String is :" +nstr);
	}

}
