package ex_Lab_Collection.List;

import java.util.ArrayList;

public class List2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("yohoo");
        arrayList.add("google");
        arrayList.add("Orange");
        arrayList.add(true);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("Orange"));
        System.out.println(arrayList.indexOf("google"));
        for (int i =0;i< arrayList.size(); i++) {
         arrayList.get(i);
        }

        arrayList.set(1,"Google");
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);

    }
}
