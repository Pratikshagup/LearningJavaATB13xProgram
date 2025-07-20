package ex_Lab_Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_MapInterview {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",1);
        map.put("id",2);
        map.put("id2",2);
        map.put("id3",4);
        map.put("id4",6);
        map.put("id5",null);
        map.put("id6",null);
        map.put("null",67);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id5"));
        System.out.println(map.containsValue("44"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.remove("id2"));
        System.out.println(map);

    }
}
