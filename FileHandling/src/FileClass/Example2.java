//string [] list() method of File Class

package FileClass;
import java.io.*;

public class Example2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the path");
		String dirpath = br.readLine();
		System.out.println("Enter Directory Name");
		String dname =br.readLine();
		
		File f = new File(dirpath,dname);
		if(f.exists())
		{
			String []arr =f.list();
			int n = arr.length;
			
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]);
				
				File f1 = new File(arr[i]);
				if(f1.isFile())
					System.out.println(":is a file");
				if(f1.isDirectory())
					System.out.println(": is a directory");
				
			}
			System.out.println("no of entries in this directory is :"+n);
		}else
		{
			System.out.println("Directory does not exists");
		}

	}

}
