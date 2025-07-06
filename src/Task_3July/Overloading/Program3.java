package Task_3July.Overloading;

public class Program3 {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        int product = m.multiply(4, 6);
        int product2 = m.multiply(3,7,9);
        System.out.println("Product of two numbers: "+product);
        System.out.println("Product of three numbers: "+product2);
    }
}

class MathOperations{
    int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    int multiply(int a, int b, int c){
        int product = a*b*c;
        return product;
    }

}
