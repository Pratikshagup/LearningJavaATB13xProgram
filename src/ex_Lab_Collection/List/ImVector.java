package ex_Lab_Collection.List;
import java.util.Iterator;
import java.util.Vector;

public class ImVector { //it is thread safe instead of arraylist
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Tina");
        v.add(5677);
        v.add(true);
        System.out.println(v);

        Iterator iterator = v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
}
