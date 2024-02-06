//Writing file using File OutputStream class

package WrittingFile;
import java.io.*;

public class Example3 {

	public static void main(String[] args) {

       String str ="This is another method to write data in file";
       FileOutputStream o =null;
       
       try
       {
    	   o = new FileOutputStream("prachi.txt");
    	   
    	   //
    	   byte []arr = str.getBytes();
    	   o.write(arr);
    	   System.out.println("Data written successfully");    	   
       }catch(IOException e)
       {
    	   System.out.println(e);
       }finally
       {
    	   if(o!=null)
    	   {
    		   try
    		   {
    			   o.close();
    		   }catch(IOException f)
    		   {
    			   System.out.println(f);
    		   }
    	   }
       }
		
	}

}
