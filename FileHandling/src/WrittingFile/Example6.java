//You can also write Data in file can also be written using DataOutputStream .

package WrittingFile;
import java.io.*;

public class Example6 {

	public static void main(String[] args) {
		DataOutputStream out = null;
		try
		{
     FileOutputStream fo =new FileOutputStream("tiger.txt");
     out = new DataOutputStream(fo);
     out.writeInt(256);
     out.writeBytes("123");
     out.flush();
     System.out.println("Data written successfully");
		}catch(IOException e)
		{
			System.out.println(e);
		}finally {
			if(out!=null)
			{
				try
				{
					out.close();
				}catch(IOException f)
				{
					System.out.println(f);
				}
			}
		}
		
	}

}
