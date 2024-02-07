//create a file uisng FileOutputStream 

package booksProgram;
import java.io.*;

public class Example1 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		DataInputStream dis =new DataInputStream(System.in); //for input
		
		FileOutputStream fo = new FileOutputStream("Ria.txt");    
		System.out.println(" Enter data in file till @");
		
		char ch;
		while((ch=(char)dis.read())!='@')
		{
			fo.write(ch);
		}
	fo.close();	
		
         FileInputStream f = new FileInputStream("Ria.txt");
         
         int y;
         
         do {
        	 y=f.read();
        	 System.out.print((char)y);
         }while(y!=-1);
         f.close();
         }
	}


