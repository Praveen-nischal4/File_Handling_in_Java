//You can also write file using writeString a method of FileWriter class.


package WrittingFile;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example2 {

	public static void main(String[] args) throws IOException{
   
      String str ="Hi this is Praveen Welcome to the world of Java8";
      Path p =Path.of("File3.txt");
      Files.writeString(p, str);
      System.out.println("Data writtend successfully");
      
      //for reading data of file
      
      String file_content = Files.readString(p);
      System.out.println(file_content);
	}

}
