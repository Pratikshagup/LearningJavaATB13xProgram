package Task_11July;

import java.util.LinkedList;

public class Program6 {
    public static void main(String[] args) {
      LinkedList<String> fruits = new LinkedList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println(fruits);
        fruits.add(1,"Orange");
        System.out.println("Fruits List:" +fruits);
    }
}
