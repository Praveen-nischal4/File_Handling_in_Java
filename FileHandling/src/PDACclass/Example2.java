//reading data from char array

package PDACclass;
import java.io.*;

public class Example2 {

	public static void main(String[] args)  throws IOException{
		
      char c[] = new char[100];
      FileReader fin = new FileReader("Raju.txt");
 
      fin.read(c);     // it store content of file with size of array
      System.out.println(c);
      fin.close();

	}

}
