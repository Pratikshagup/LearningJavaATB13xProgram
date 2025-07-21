package Task_15July;

import java.util.HashMap;
import java.util.Map;

public class Program1 {
    public static void main(String[] args) {
        String input ="java is easy and java is powerful";
        String[] words= input.split(" ");
        Map<String,Integer> wordcount = new HashMap<>();

        for (String word: words){
           // if(wordcount.containsKey(word)) {
                wordcount.put(word, wordcount.getOrDefault(word,0) + 1); //for existing word in hashmap
           // }
           // else wordcount.put(word,1); //for new word
        }
        for (String word:wordcount.keySet()){
            System.out.println(word + " -> " + wordcount.get(word));
        }

    }
}
