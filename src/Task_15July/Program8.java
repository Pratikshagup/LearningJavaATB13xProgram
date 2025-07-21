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
        char mostFrequentChar = ' ';
        int maxFreq = 0;

        // Use keySet() to find the character with maximum frequency
        for (Character key : freq.keySet()) {
            int currentFreq = freq.get(key);
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                mostFrequentChar = key;
            }
        }

        System.out.println("Most frequent character is: " + mostFrequentChar + "(" + maxFreq+ "times)");

    }
}
