package ex_Super;

import org.w3c.dom.ls.LSOutput;

public class Super {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.sound();
        cat.test();
    }
}

class God{
    public int gold = 100;
    void sound(){
        System.out.println("Sound of God");
    }

    God(){
        System.out.println("Default constructor");
    }
}

class Animal extends God{
    @Override
    void sound(){
        System.out.println("Sound of Animal");
        super.sound(); //calls parent method
    }
    Animal(){
        super(); // calls parent constructor
    }

    void test(){
        System.out.println(super.gold); //excess parents variable
    }
}
