package Task_3July.Overloading;

public class Program5 {
    public static void main(String[] args) {
        Utility u = new Utility();
        int max1 = u.max(45,78);
        int max2 = u.max(34,67,35);
        double max3 = u.max(78.5, 45.6);
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
    }
}
 class Utility{
     int max(int a, int b){
       if(a>b){
           return a;
       }
       else return b;
     }
     int max(int a, int b, int c){
         if(a>b && a>c){
             return a;
         } else if (b>a && b>c) {
             return b;
         }
         else return c;
     }
     double max(double a, double b){
         if(a>b){
             return a;
         }
         else return b;
     }
 }