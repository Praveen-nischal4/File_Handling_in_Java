//Reading text file string by string using Bufferedreade

package PractiseProgram;
import java.io.*;

public class Example7 {

	public static void main(String[] args) throws IOException{
		
		String  str;
		FileReader fin =null;
		
		try
		{
		 fin = new FileReader("Raju.txt");
		BufferedReader br = new BufferedReader(fin);
	
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			if(fin!=null)
			{
				try
				{
					fin.close();
				}catch(IOException f)
				{
					System.out.println(f);
				}
			}
		}

	}

}
