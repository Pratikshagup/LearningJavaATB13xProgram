package Task_11July;

import java.util.ArrayList;

public class Program2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Amit");
        arrayList.add("Neha");
        arrayList.add("Suresh");
        System.out.println("Before removal: "+arrayList);
        arrayList.remove(1);
        System.out.println("After removal: "+arrayList);
    }
}
