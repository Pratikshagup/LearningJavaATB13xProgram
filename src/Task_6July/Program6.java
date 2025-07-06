package Task_6July;

public class Program6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.dogEat();

    }
}

class Animal{
    protected void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void dogEat(){
        eat();
    }
}