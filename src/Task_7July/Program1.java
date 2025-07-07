package Task_7July;

public class Program1 {
    public static void main(String[] args) {
      Dog dog = new Dog();
      dog.makesound();
      Cat cat = new Cat();
      cat.makesound();
    }
}

abstract class Animal{
    abstract void makesound();
}

class Dog extends Animal{
    @Override
    void makesound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    @Override
    void makesound(){
        System.out.println("Cat meows");
    }
}