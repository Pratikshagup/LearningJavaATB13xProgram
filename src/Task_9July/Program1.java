package Task_9July;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Integer a = Integer.parseInt(args[0]);
        Integer output =0;
        try {
            output = 100/a;
        } catch (ArithmeticException e) {
            System.out.println("Not divisible by 0");
        }
        System.out.println(output);

    }
}
