package ex_Lab_Collection.Map;

import java.util.*;

public class Lab_MapReal {
    public static void main(String[] args) {
        Map<String,Object> Student1 = new HashMap();
        Student1.put("name","Pratiksha");
        Student1.put("phone",976785788);
        Student1.put("address1","Agra");
        Student1.put("address2",282001);

        Map<String,Object> Student2 = new HashMap();
        Student2.put("name","Prateek");
        Student2.put("phone",986785788);
        Student2.put("address1","Agra");
        Student2.put("address2",282001);

        ArrayList list = new ArrayList(); //maintain order & allow duplicates
        list.add(Student1);
        list.add(Student2);
        System.out.println(list);

        Set book_item = new HashSet(); //promotes uniqueness & doesn't maintain order
        book_item.add("Acronyms");
        book_item.add("FrogLike");
        book_item.add("Fire 22");
        book_item.add("Fire 22");
        System.out.println(book_item);


    }
}
