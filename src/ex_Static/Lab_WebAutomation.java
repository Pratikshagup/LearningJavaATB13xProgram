package ex_Static;

public class Lab_WebAutomation {
    public static void main(String[] args) {
        System.out.println(Automation.driver); // static variable access by class name
        Automation t1 = new Automation();
        Automation t2 = new Automation();
        Automation t3 = new Automation();
        System.out.println(t1.driver); //access by object reference
    }
}

class Automation{
    static String driver = "Chrome";
}
