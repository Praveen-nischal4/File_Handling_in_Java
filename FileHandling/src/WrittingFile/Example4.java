// BufferedWritter class is also used to write data in a file

package WrittingFile;
import java.io.*;

public class Example4 {

	public static void main(String[] args) {
   
		String myStr="Hi this is Farheen i am new to file handling in java 8 please guid me to write data in the file";
		try
		{
               BufferedWriter bw = new BufferedWriter(new FileWriter("farheen.txt"));
               bw.write(myStr);
               System.out.println("Data written successfully");
               bw.close();
             
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
