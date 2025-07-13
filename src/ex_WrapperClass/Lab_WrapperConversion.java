package ex_WrapperClass;

public class Lab_WrapperConversion {
    public static void main(String[] args) {
        int a =20;
        Integer b =a; //Autoboxing ->automatically convert primitive to wrapper
        System.out.println(b.intValue());
        System.out.println(Integer.MAX_VALUE);

        Integer a2 = 43;
        int v = a2; //Unboxing -> converts wrapper to primitive
        System.out.println(v);
    }

}
