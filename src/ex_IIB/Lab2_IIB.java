package ex_IIB;

public class Lab2_IIB {
    public static void main(String[] args) {
        new A1();
    }
}
class A1{
    {
        System.out.println("Hi from IIB1");
    }
    {
        System.out.println("Hi from IIB2");
    }
    {
        System.out.println("Hi from IIB3");
    }
    static {
        System.out.println("SIB - first loaded");
    }
}
