package PDACclass;
import java.io.*;

public class Prog4 {

    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("Raju.txt")) {
            byte b[] = new byte[100];
            int bytesRead;
            while ((bytesRead = fin.read(b)) != -1) {
                for (int i = 0; i < bytesRead; i++) {
                    System.out.print((char) b[i]);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
