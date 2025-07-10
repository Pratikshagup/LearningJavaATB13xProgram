package Task_9July;

public class Program3 {
    public static void main(String[] args) {
        int a = 0, c =0;
        try {
            a = Integer.parseInt(args[0]);
            c=100/a;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Not divisible by 0");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        finally {
            System.out.println("This will execute everytime");
        }
    }
}
