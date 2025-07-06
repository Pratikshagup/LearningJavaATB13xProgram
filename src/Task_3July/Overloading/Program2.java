package Task_3July.Overloading;

public class Program2 {
    public static void main(String[] args) {
      Printer pr = new Printer();
      String name = pr.printData("Pratiksha");
      float dt = pr.printData(3.14f);
      int db = pr.printData(981996);
        System.out.println(name);
        System.out.println(dt);
        System.out.println(db);


    }
}

class Printer{
    String printData(String data){
        System.out.println(data+ " is visible as string");
        return data;
    }

    int printData(int data){
        System.out.println(data+ " is visible as integer");
        return data;
    }
    float printData(float data)
    {
        System.out.println(data+ " is visible as float");
        return data;
    }
}
