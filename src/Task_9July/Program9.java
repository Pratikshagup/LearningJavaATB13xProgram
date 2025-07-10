package Task_9July;

public class Program9 {
    public static void main(String[] args) {
        System.out.println("This program will skip catch block");
        int a = 5, b= 4;
        int c=0;
        try {
            c = a+b;
            System.out.println("Output from try block: " +c);
        } catch (Exception e) {
            System.out.println("Exception will not be there");
        } finally {
            System.out.println("Finally will print after");
        }

    }
}
