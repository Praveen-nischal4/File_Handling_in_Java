//Read a file uisng FileInputStream

package PractiseProgram;
import java.io.*;

public class Example5 {

	public static void main(String[] args) throws IOException {
		int ch;
		FileInputStream f=null;
		
		try
		{
			f =new FileInputStream("Book.txt");
		}catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			return;
		}
		finally
		{
			while((ch=f.read())!=-1)
			{
				System.out.print((char)ch);
			}
			f.close();
		}

	}

}
