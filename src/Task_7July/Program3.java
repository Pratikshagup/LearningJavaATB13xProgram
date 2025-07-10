package Task_7July;

public class Program3 {
    public static void main(String[] args) {

    }
}

abstract class Program{
    abstract void func();
    Program(){}
}

class childprog extends Program{
    @Override
    void func() {
        System.out.println("Method from abstract class");
    }
    childprog(){
        //super.Program();
    }
}
