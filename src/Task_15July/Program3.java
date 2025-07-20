package Task_15July;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program3 {
    public static void main(String[] args) {
        Map hash = new HashMap();
        hash.put("Ravi",80);
        hash.put("Anjali",95);
        hash.put("Dipak",75);

        Map<String,Integer> tree = new TreeMap<>(hash);

        for( String key : tree.keySet()){
            System.out.println(key+" -> " +tree.get(key));
        }

    }
}
