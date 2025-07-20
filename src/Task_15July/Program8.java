package Task_15July;

import java.util.HashMap;
import java.util.Map;

public class Program8 {
    public static void main(String[] args) {
        String input = "aaaabbbcc";

        Map<Character,Integer> freq = new HashMap<>();
        for(char c : input.toCharArray())
        {
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        for( Character key : freq.keySet()){
            System.out.println(key+" -> " +freq.get(key));
        }

    }
}
