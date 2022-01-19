package com.pravotosoft;

public class WhiteSpaceWithoutReplace {
	public static void main(String[] args) {
		String str="I  Love My    India";
		char[]strArray=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<strArray.length;i++){
			if((strArray[i]!=' ')&&(strArray[i]!='\t')){
				sb.append(strArray[i]);
			}
		}
		String noSpace=sb.toString();
		System.out.println(noSpace);
	}

}
