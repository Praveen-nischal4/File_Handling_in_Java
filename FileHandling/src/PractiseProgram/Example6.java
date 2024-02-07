package PractiseProgram;
import java.io.*;

public class Example6 {

	public static void main(String[] args) throws IOException {
		
    DataInputStream dis = new DataInputStream(System.in);
    FileOutputStream fo = new FileOutputStream("Raju.txt");
    BufferedOutputStream bo = new BufferedOutputStream(fo,1024);
      
    char ch;
    while((ch=(char)dis.read())!='@')
    {
    	bo.write(ch);
    }
    bo.close();
    
    
	FileInputStream fi = new FileInputStream("Raju.txt");
	int y;
	do
	{
		y=fi.read();
		System.out.print((char)y);
	}while(y!=-1);

   }
}


