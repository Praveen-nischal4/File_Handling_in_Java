package PractiseProgram;

import java.io.*;

public class Example4 {

	public static void main(String[] args) throws IOException{
       
		String str ="Hello Good Night";
		FileWriter f= new FileWriter("Book.txt");
		
		for(int i=0;i<str.length();i++)
		{
			f.write(str.charAt(i));
		}
		f.close();
		System.out.println("Written successfully");
		
		

	}

}
