package ex_Lab_Collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class Lab_TreeMap {
    public static void main(String[] args) {
        Map<String,Integer> values = new TreeMap<>();
        values.put("Third",3);
        values.put("First",1);
        values.put("Second",2);

        System.out.println("TreeMap is sorted" +values);

        //replace values
        values.replace("First",11);
        System.out.println(values);

        values.remove("Second");
        System.out.println(values);


    }
}
