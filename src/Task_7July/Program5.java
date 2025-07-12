package Task_7July;

import java.lang.classfile.Interfaces;

public class Program5 {
    public static void main(String[] args) {
        Documents d = new Documents();
        d.print();
        d.show();
    }
}

interface Printable{
    void print();
        }

        interface Showable{
    void show();
        }
class Documents implements Printable,Showable{
    @Override
    public void print() {
        System.out.println("Printing Document");
    }

    @Override
    public void show() {
        System.out.println("Showing Document");
    }
}