package Task_15July;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program5 {
    public static void main(String[] args) {
        String input ="aabbccdeeff";
        Map<Character,Integer> freq =new LinkedHashMap<>();
        for(char c : input.toCharArray()){
          freq.put(c, freq.getOrDefault(c,0)+1);
        }
        for( Character key : freq.keySet()){
            if(freq.get(key)==1){
                System.out.println("First non-repeated character is: "+key);
            }
        }


    }

}
