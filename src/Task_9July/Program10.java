package Task_9July;

import java.io.File;
import java.io.FileReader;

public class Program10 {
    public static void main(String[] args) {
        int a =0, c=0;
        try {
            a = Integer.parseInt(args[0]);
            c=100/0;
            FileReader f = new FileReader(new File("C://abc.txt"));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
