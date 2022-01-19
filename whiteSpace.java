package com.pravotosoft;

public class whiteSpace {
	public static void main(String[] args) {
		String str="I Love  My    India";
		String noSpace=str.replaceAll("\\s", "");
		System.out.println(noSpace);
	}

}
