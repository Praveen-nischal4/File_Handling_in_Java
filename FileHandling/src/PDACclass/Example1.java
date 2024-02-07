package PDACclass;
import java.io.*;

public class Example1 {

	public static void main(String[] args) throws IOException {
	
		//FileInputStream fin = new FileInputStream("Raju.txt");
		FileReader fin = new FileReader("Raju.txt");
		int y;
		do
		{
			y=fin.read();
			System.out.print((char)y);
		}while(y!=-1);

	}

}
