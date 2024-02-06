//you can also use FileInputStream to read a file and its content.

package Basic;
import java.io.*;

public class Example2 {

	public static void main(String[] args) throws IOException{

		FileInputStream r = new FileInputStream("File2.txt");
		int y;
		do {
			y =r.read();
			System.out.print((char)y);
		}while(y!=-1);

	}

}
