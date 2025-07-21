package Task_15July;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program7 {
    public static void main(String[] args) {
        Map<Integer, String> name = new HashMap<>();
        name.put(101,"Anjali");
        name.put(102,"Dipak");
        name.put(103,"Aman");

        Map<Integer,String> tree = new TreeMap<>(name);

        for( Integer key : tree.keySet()){
            if(tree.get(key).startsWith("A")){
                System.out.println(key+" -> " +tree.get(key));
            }

        }

    }
}
