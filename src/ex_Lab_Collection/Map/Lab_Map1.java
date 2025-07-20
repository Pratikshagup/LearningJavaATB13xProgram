package ex_Lab_Collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_Map1 {
    public static void main(String[] args) {
        Map m1 = new HashMap(10);
        m1.put("name","Pratiksha");
        m1.put("rollno",1);
        m1.put("phone",958879567);
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        m2.put("name","Prateek");
        m2.put("rollno",2);
        m2.put("phone",968879567);
        System.out.println(m2);

       Map m3 = new TreeMap();
        m3.put("name","Prachi");
        m3.put("rollno",3);
        m3.put("phone",978879567);
        System.out.println(m3);
    }
}
