package PDACclass;
import java.io.*;



public class Example3 {

    public static void main(String[] args) 
    { 
    	char r[] = new char[100];
    
        try (FileReader f = new FileReader("Raj.txt")) {
           
            // Initialize the first 6 positions with '*'
            for (int i = 0; i < 6; i++) {
               r[i] = '*';
            }

         
            // Read characters starting from the 6th position
            f.read(r, 6, 10);

            // Print the content of the char array
            System.out.println(r);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
