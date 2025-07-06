package Task_3July.Overloading;

public class Program1 {
    public static void main(String[] args) {
       Calculator cal = new Calculator();
       int result1 = cal.add(5, 8);
       double result2 = cal.add(6.7, 8.7);
        System.out.println(result1);
        System.out.println(result2);
    }

}

class Calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}


