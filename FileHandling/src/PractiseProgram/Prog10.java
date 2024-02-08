package PractiseProgram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prog10 {

    public static void main(String[] args) {
        String filePath = "Raju.txt"; // Replace this with the path to your file
        int charCount = 0;
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                charCount += line.length(); // Count characters in the line
                String[] words = line.split("\\s+"); // Split the line into words using whitespace as delimiter
                wordCount += words.length; // Count words in the line
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
    }
}
