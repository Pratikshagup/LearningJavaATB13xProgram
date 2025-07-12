package Task_7July;

public class Program3 {
    public static void main(String[] args) {
    childprog cp = new childprog();
    cp.func();
    }
}

abstract class Program{
    abstract void func();
    Program(){
        System.out.println("Abstract class constructor called");
    }
}

class childprog extends Program{
    @Override
    void func() {
        System.out.println("Method from abstract class");
    }
    childprog(){
        super();
    }
}
