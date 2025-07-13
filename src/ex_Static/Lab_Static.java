package ex_Static;

public class Lab_Static {
    public static void main(String[] args) {
        A ref1 = new A(10);
        A ref2 = new A(12);
        System.out.println(ref1.a);
        System.out.println(ref2.a);
        System.out.println(A.b);
        System.out.println(ref1.b);
        System.out.println(ref2.b);

        ref1.display();
        ref2.display();

        A.test();


    }
}
class A{
    int a =10;
    static  int b =20;

    A(int a){
        this.a =a;
    }
    void display(){
        System.out.println(this.a);
    }
    static void test(){
        System.out.println("Hi from static method");
        //static method cannot access non-static variable
        //System.out.println(this.a);
        // This is becoz static method is called starting of program
        // --before non-static variable are initialized
        System.out.println(b);
    }
}
