package ex_Static;

public class Lab_StaticvsIIB {
    public static void main(String[] args) {
      //  P p1 = new P();
        System.out.println(P.a);

    }
}
class P{
    static int a = 10; //static variable are shared with other methods

    static{
        // This is static block which is called as class is loaded
        System.out.println("Hi from static block");

        //call database file, excel file, webdriver collection : real life scenarios
    }
}
