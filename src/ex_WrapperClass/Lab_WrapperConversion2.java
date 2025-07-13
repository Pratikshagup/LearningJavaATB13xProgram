package ex_WrapperClass;

public class Lab_WrapperConversion2 {
    public static void main(String[] args) {
        String num ="10";
        // String -> wrapper
        Integer a = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);

        //String to primitive
        int a1 = Integer.parseInt(num);

        // Wrapper -> String
        System.out.println(a.toString());

        //Primitive -> String
        int age = 28;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());
    }
}
