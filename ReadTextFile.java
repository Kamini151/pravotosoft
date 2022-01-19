package com.pravotosoft;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args) {
		String fileName="temp.txt";
		String line=null;
		try{
			FileReader fr=new FileReader(fileName);
			
			BufferedReader bf=new BufferedReader(fr);
			while((line=bf.readLine())!=null){
				System.out.println(line);
			}
			bf.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Unable to open file'"+fileName+"'");
			
		}
		catch(IOException e){
			System.out.println("Error reading file'"+fileName+"'");
		}
	}

}
