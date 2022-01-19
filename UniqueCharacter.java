package com.pravotosoft;

import java.util.HashSet;

public class UniqueCharacter {
	public static void main(String[] args) {
		String str="i love india ";
		boolean result = false;
		System.out.println(str);
		HashSet<Character>hs=new HashSet<Character>();
		for(int i=0;i<str.length();i++){
			result=hs.add(str.charAt(i));
			if(result==false)
				break;
		}
		
		System.out.println(result);
	}

}
