//ziping of file is done using DeflaterOutputStream class

package PractiseProgram;
import java.io.*;
import java.util.zip.DeflaterOutputStream;

public class Example8 {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fi =new FileInputStream("Raju.txt");
		FileOutputStream fo = new FileOutputStream("File2.txt");
		
		DeflaterOutputStream  dso = new DeflaterOutputStream(fo);
		
		int data;
		
		while((data =fi.read())!=-1)
		{
			dso.write(data);
		}
		fi.close();
		dso.close();
	}

}
