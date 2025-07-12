package Task_7July;

public class Program4 {
    public static void main(String[] args) {
        Child child =new Child();
        child.show();
      child.display();
    }
}
abstract class Parent{
    abstract void show();
    void display(){
        System.out.println("Abstract method implemented");
    }
}
 class Child extends Parent{
     @Override
     void show() {
         System.out.println("Concrete method in abstract class");
     }
 }
