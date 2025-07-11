package Task_11July;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program5 {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        long starttime = System.currentTimeMillis();
        for (int i =0; i<100000; i++){
            arrayList.add(i);
        }
        long endtime = System.currentTimeMillis();
        long duration = endtime -starttime;
        System.out.println("ArrayList time: " +duration+ "ms");

        //Linked list
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        long starttime1 = System.currentTimeMillis();
        for (int i =0; i<100000; i++){
            linkedList.add(i);
        }
        long endtime1 = System.currentTimeMillis();
        long duration1 = endtime1 -starttime1;
        System.out.println("LinkedList time: " +duration1+ "ms");

    }
}
