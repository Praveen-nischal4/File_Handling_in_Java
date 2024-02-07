//You can use File class alos to write data in a file

package WrittingFile;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example5 {

	public static void main(String[] args) {
		
		String mystr="Hello i am File classs and also used to write data in file ";
		try
		{
		Path p = Paths.get("myFilee.txt");
		byte arr[] =mystr.getBytes();
		Files.write(p, arr);
		System.out.println("Data written successfully");
		}catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
