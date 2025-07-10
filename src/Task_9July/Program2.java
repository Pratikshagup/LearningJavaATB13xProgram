package Task_9July;

public class Program2 {
    public static void main(String[] args) {

        try {
            int a = 10/0;
            int b = Integer.parseInt(args[0]);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception occured!");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index bound Exception");
        }
    }
}
