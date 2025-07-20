package ex_Lab_Collection.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab_HashTable {
    public static void main(String[] args) {
        // Hashtable -> legacy class, synchronised & slow i.e. Thread safe
        // T1 T2 tasks are done one by one

        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"One");
        ht.put(1,"One");
        ht.put(2,"two");
        ht.put(3,"Three");
       /*
        ht.put(4,"null"); //null pointer exception
        ht.put(null,"One"); //null pointer exception
       */
        System.out.println(ht);

        Enumeration<Integer> e = ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


    }
}
