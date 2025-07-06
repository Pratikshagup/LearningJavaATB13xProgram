package Task_3July.Overloading;

public class Program4 {
    public static void main(String[] args) {
     Greeter gr = new Greeter();
     gr.greet();
     gr.greet("Pratiksha");
    }
}

class Greeter{
    void greet(){
        System.out.println("Hello!!");
    }
     void greet(String name){
        System.out.println("Hello!"+name);
    }
}
