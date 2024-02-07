package PractiseProgram;
import java.io.*;

public class Example2 
{
	public static void main(String[] args) throws IOException {
    
		DataInputStream dis =new DataInputStream(System.in);
		
		FileOutputStream fo = new FileOutputStream("Rinku.txt");

		BufferedOutputStream bo = new BufferedOutputStream(fo,1024);
		
		System.out.println("Write data in file till @");
		char ch;
		while((ch=(char)dis.read())!='@')
		{
			bo.write(ch);
		}
		bo.close();
		
		FileInputStream fin = new FileInputStream("Rinku.txt");
		int y;
		do {
			y=fin.read();
			System.out.print((char)y);
		}while(y!=-1);
		
		fin.close();
	}

}
