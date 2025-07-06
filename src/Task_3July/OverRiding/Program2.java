package Task_3July.OverRiding;

public class Program2 {
    public static void main(String[] args) {
     Bike b = new Bike();
     b.starts();
     Car c = new Car();
     c.starts();
    }
}

class Vehicle{
    void starts(){
        System.out.println("Default starts");
    }
}
class Bike extends Vehicle{
    @Override
    void starts(){
        System.out.println("Kick start the bike");
    }
}
class Car extends Vehicle{
    @Override
    void starts(){
        System.out.println("Turn the key to start the car");
    }
}


