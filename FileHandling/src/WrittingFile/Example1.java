//File can be written by  using mnay classes 
// 1 : FileWritter class


package WrittingFile;
import java.io.*;

public class Example1 {

	public static void main(String[] args) throws IOException{
		String mystr="Hello welcome to the world of java & File handling";
		
		  try (FileWriter f = new FileWriter("myFile.txt")) {
	            // Write content to file
	            f.write(mystr);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		FileReader r;
		try {
			r = new FileReader("myFile.txt");
			int y;
			do
			{
				y=r.read();
				System.out.print((char)y);
				
			}while(y!=-1);
			r.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
	}

}
