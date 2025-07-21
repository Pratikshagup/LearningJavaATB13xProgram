package Task_15July;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program6 {
    public static void main(String[] args) {
        String[] string = {"Java", "is", "fun", "cool", "Hi"};

        Map<Integer, List<String>> wordlength = new HashMap<>();
        for(String word: string)
        {
            int length = word.length();
            if (!wordlength.containsKey(length)) { // create new list in case of key not available
                wordlength.put(length, new ArrayList<>());
            }
            wordlength.get(length).add(word); //otherwise just add value to existing key
        }

        for(Integer length: wordlength.keySet()){
            System.out.println(length+ "->" +wordlength.get(length));
        }
    }
}

