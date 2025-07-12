package ex_Super;

public class SuperKeyword {
    public static void main(String[] args) {
 Car c = new Car(100);
 c.display();
    }
}

class Vehicle{
    int maxspeed = 180;
    Vehicle(){
        System.out.println("Default Constructor");
    }
    Vehicle(int a){
        System.out.println("Parameter Constructor");
    }

  //method overloading
    void message(){
        System.out.println("Method Overloading1");
    }
    void message(int a){
        System.out.println("Method Overloading2");
    }
    int message(String b){
        System.out.println("Method Overloading3");
        return 0;
    }

    void display(){
        System.out.println("Vehicle is there!!");
    }

}

class Car extends Vehicle{
    private int maxspeed = 280;

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    Car(){
        super(); //calls parent default constructor
    }
    Car(int a){
        super(20); //calls parent parameter constructor
    }

    @Override
    void display() {
        System.out.println("Hello from Override method");
        super.display(); //calls parent method
        System.out.println(super.maxspeed); //calls parent instance
        System.out.println(this.maxspeed); //calls self instance
    }
}
