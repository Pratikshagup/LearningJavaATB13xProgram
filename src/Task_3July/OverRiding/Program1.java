package Task_3July.OverRiding;

public class Program1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        Cow cow = new Cow();
        cow.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Sound of Animal");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}
class Cow extends Animal{
    @Override
    void sound(){
        System.out.println("Cow moos");
    }
}
