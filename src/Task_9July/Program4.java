package Task_9July;

public class Program4 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        try {
            b = 10 /a;

            try {
                int c = Integer.parseInt(args[0]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array Bound");
            }
        } catch (ArithmeticException e) {
            System.out.println("Divisible by 0 not allowed");
        }


    }

}
