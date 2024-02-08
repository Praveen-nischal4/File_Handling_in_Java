package FileClass;
import java.io.*;
public class Example1 {

	public static void main(String[] args) throws IOException {
		
  File obj = new File("Raju.txt");        // to create file
                                                          
  File obj2 = new File("Lino.txt");           // to create a new file
  System.out.println(obj2.createNewFile());
  File obj4 = new File("Tino.txt");
  
  File obj1 = new File("C:\\Users\\PRAVEEN\\MyProg");             // to create directory
  File obj3 =new File("C:\\\\Users\\\\PRAVEEN\\JAVA");
  System.out.println(obj3.mkdir());
  
  System.out.println(obj2.renameTo(obj4));
  System.out.println(obj.isFile());
  System.out.println(obj.getAbsolutePath());
  System.out.println(obj1.isDirectory());
  System.out.println(obj.getPath());
  System.out.println(obj.canRead());
  System.out.println(obj.canExecute());
  System.out.println(obj.exists());
  System.out.println(obj.getParent());
  System.out.println(obj.length());
  //System.out.println(obj3.delete());    // it will delete the directory of file whithout showing in bin
  
  
	}

}
