package PDACclass;
import java.io.*;

public class CopyData {

	public static void main(String[] args) throws IOException{

		FileInputStream fin = new FileInputStream("Raju.txt");
		FileOutputStream fout =new FileOutputStream("CopyRaju.txt");
		
		int y;
		do
		{
			y=fin.read();
			fout.write(y);
			System.out.print((char)y);
		}while(y!=-1);
       
		fin.close();
		fout.close();
	}

}
