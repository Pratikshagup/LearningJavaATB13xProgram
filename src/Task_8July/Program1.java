package Task_8July;

public class Program1 {
    public static void main(String[] args) {
        int age = 40;
        System.out.println("Primitive: " +age);
        Integer age_wrapper = age;
        System.out.println("Wrapper: "+age_wrapper);
        //Unboxing
        int age_unbox = age_wrapper;
        System.out.println("Unboxed again: "+age_unbox);
    }
}
