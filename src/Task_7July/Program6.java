package Task_7July;

public class Program6 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Vehicle.fuelType();
    }
}
interface Vehicle{
    default void start()
    {
        System.out.println("Vehicle started");
    }
    static void fuelType(){
        System.out.println("Fuel type is Petrol");
    }
}
class Car implements Vehicle{

}

