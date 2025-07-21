package Task_15July;

import java.util.HashMap;
import java.util.Map;

public class Program4 {
    public static void main(String[] args) {
        String input = "aabbccddeeff";

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : input.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (Character key : freq.keySet()) {
            System.out.println(key + " -> " + freq.get(key));
        }
    }
}
