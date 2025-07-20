package Task_15July;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Program2 {
    public static void main(String[] args) {
        Map<String,String> user = new HashMap<>();
        user.put("Name","Dipak");
        user.put("Role","Tester");
        user.put("Level","Senior");

        // Iterate via entry-set
        System.out.println("Iterate via entry-set");
        for( Map.Entry<String,String> item: user.entrySet()){
            System.out.println(item.getKey()+ " ->" +item.getValue());
        }

        // Iterate via key-set
        System.out.println("Iterate via key-set");
        for(String key : user.keySet()){
            System.out.println(key+" -> " +user.get(key));
        }

        // Iterate via Iterator
        System.out.println("Iterate via Iterator");
        Iterator<Map.Entry<String,String>> iterator = user.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
    }
}
