//Unzipping of a file using class InflaterInputStream 


package PractiseProgram;
import java.io.*;
import java.util.zip.InflaterInputStream;

public class Example9 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		  FileInputStream fi = new FileInputStream("File2.txt");
		     FileOutputStream fo = new FileOutputStream("File3.txt");
		     InflaterInputStream iif = new InflaterInputStream(fi);  
		     
		     //read data from InflaterInputStream and write into FileOutputStream
		     
		     int data;
		     while((data=iif.read())!=-1)
		     {
		    	 fo.write(data);
		     }
		     fo.close();
		     iif.close();

	}

}
