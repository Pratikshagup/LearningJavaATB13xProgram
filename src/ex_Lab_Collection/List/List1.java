package ex_Lab_Collection.List;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List l = new ArrayList();//Dynamic dispatch : create child object with parent reference
        l.add(23);
        l.add("Pratiksha");
        l.add(56.8);
        System.out.println("list Added: " +l);
    }
}
