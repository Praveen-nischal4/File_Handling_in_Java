//this is simple data so written in file 

package SerializableConcept;

import java.io.FileWriter;
import java.io.IOException;

public class Employee {

	public static void main(String[] args) throws IOException{
   
		String name="Rita";
		int age =49;
		double Salary=45678.6554;
   
		try(FileWriter fw = new FileWriter("Employee.txt")){
			fw.write(name+" "+age+" "+Salary);
			fw.flush();
			System.out.println("Data written successfully ino file");
		}
		
	}

}
