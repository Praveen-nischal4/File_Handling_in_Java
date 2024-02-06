//w.a.p to readand display content of file .

package Basic;
import java.io.*;

public class Example1 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
    FileReader r = new FileReader("File2.txt");	
    int y;
	do
    {
          y =r.read();                              //to read a single chracter 
          System.out.print((char)y);         //and when loop is initialized and last chracter is not eqaul to -1.
	}while(y!=-1);

}
}
