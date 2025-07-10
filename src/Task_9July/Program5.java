package Task_9July;

public class Program5 {
    public static void main(String[] args) {
        int a =0, c=0;
        try {
            a = Integer.parseInt(args[0]);
            c=100/a;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception occured");
        }

    }
}
