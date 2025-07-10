package Task_9July;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program7 {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }
    }
}
