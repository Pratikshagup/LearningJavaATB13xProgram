package ex_Lab_Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_MapIterator {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("id",1);
        map.put("id2",2);
        map.put("id3",4);
        map.put("id4",6);
        map.put("id5",null);
        map.put("id6",null);
        map.put("null",67);

        System.out.println(map);
        //Alternate Iterator
        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey()+ " ->" +item.getValue());
        }
    }
}
