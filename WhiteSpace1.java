package com.pravotosoft;

public class WhiteSpace1 {
	
	    static int i;
	    
	    static void Space1(String s)
	    {
	        for(i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	            if(ch != ' ')
	            System.out.print(ch);
	        }
	    }
	    
	    
	    public static void main (String args[])
	    {
	        
	        System.out.println("Original String is : ");
	        System.out.println("   manchester united is also known as red devil   ");
	        WhiteSpace1.Space1("   manchester united is also known as red devil    ");
	    }
}
