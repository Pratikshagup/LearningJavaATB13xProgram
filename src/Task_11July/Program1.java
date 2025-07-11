package Task_11July;

import java.util.ArrayList;

public class Program1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Dipak");
        list.add("Ravi");
        list.add("Sneha");
        list.add("Priya");
        list.add("Anjali");
        System.out.println("Students List:");
        for (int i =0; i< list.size();i++) {
            System.out.println(list.get(i));
        }

    }
}
