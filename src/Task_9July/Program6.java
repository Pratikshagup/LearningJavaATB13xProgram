package Task_9July;

public class Program6 {
    public static void main(String[] args) {
        try {
            String str =  null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Generic Exception here");
        }
        try {
            String str =  null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception here");
        }

        finally {
            System.out.println("This code will execute everytime");
        }
    }
}
