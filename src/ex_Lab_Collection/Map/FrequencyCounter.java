package ex_Lab_Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        String input = "Programming";

        Map<Character,Integer> freq = new HashMap<>();
        for(char c : input.toCharArray())
        {
            /*
            p,r,o,g,....
            p = 1
            r = 1 + 1 = 2
            o = 1
            g = 1 + 1 = 2
            a = 1
            m = 1 + 1 = 2
            i = 1
            n = 1
             */
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        System.out.println(freq);
    }
}
