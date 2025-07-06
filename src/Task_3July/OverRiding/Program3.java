package Task_3July.OverRiding;

public class Program3 {
    public static void main(String[] args) {
      Manager m = new Manager();
      m.role();
      Clerk c = new Clerk();
      c.role();
      Tester t = new Tester();
      t.role();
    }
}
class Employee
{
    void role(){
        System.out.println("General Employee");
    }
}
class Manager extends Employee{
    @Override
    void role(){
        System.out.println("Manager");
    }
}
class Clerk extends Employee{
    @Override
    void role(){
        System.out.println("Clerk");
    }
}
class Tester extends Employee{
    @Override
    void role(){
        System.out.println("Tester");
    }
}