package Task_9July;

public class Program8 {
    public static void main(String[] args) {
        System.out.println("Start a program");
        try {
            int a = 10;
            if (a<18)
            {
                throw new ArithmeticException("Arithmetic exception occurred");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End the program");
    }
}
