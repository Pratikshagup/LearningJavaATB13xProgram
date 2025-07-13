package ex_IIB;

public class Lab_IIB {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
    }
}

//IIB Instance Initialization Block
// When object is created then it's called i.e. new A

class A{
    A(){
        System.out.println("Default Constructor");
    }
    {
        //This is IIB block
        System.out.println("Hi from IIB");
        System.out.println("Used for mysql connection");
        System.out.println("csv file, json file, xml file");
        System.out.println("text file");
    }
    {
        System.out.println("Second IIB");
    }

}

