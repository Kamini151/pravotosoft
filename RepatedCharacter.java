package com.pravotosoft;

public class RepatedCharacter {
	public static void main(String[] args) {
		String Str="Mummy";
		int count=0;
		char[]input=Str.toCharArray();
		System.out.println("duplicate charater are :");
		for(int i=0;i<Str.length();i++){
			for(int j=i+1;j<Str.length();j++){
				if(input[i]==input[j]){
					System.out.println(input[j]);
					count++;
					break;
				}
			}
		}
	}

}
