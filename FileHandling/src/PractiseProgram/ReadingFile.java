package PractiseProgram;
import java.io.*;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fin=null;
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter file Name ");
  
   try
   {
	   String fname = br.readLine();
   
      fin = new FileInputStream(fname);
      
      
      
         int y;
         
       do
      {
	       y=fin.read();
	        System.out.print((char)y);
	      
        }while(y!=-1);
      
	  }catch(FileNotFoundException e)
   {
		  System.out.println(e);
		  return;
   }finally {
	   if(fin!=null)
	   {
		  try
		  {
			  fin.close();
		  }catch(FileNotFoundException f)
		  {
			  System.out.println(f);
		  }
	   }
   }
	

}
}