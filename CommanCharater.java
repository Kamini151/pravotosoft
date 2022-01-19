package com.pravotosoft;

public class CommanCharater {
	public static void main(String[] args) {
		char[] str1={'a','b','c'};
		char[] str2={'a','b','c'};
		String str3="";
		for(int i=0;i<str1.length;i++){
			for(int j=i+1;j<str2.length;j++){
				if(str1.length==str2.length){
				  System.out.println("All charater are not unique ");
				}else{
					System.out.println("All Character are Unique");
				}
			}
			
		}
	}

}
