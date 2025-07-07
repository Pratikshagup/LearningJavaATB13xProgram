package Task_7July;

public class Program2 {
    public static void main(String[] args) {
      SBI s = new SBI();
      s.getInterestrate();
      HDFC h =new HDFC();
      h.getInterestrate();
    }
}
abstract class Bank{
    abstract void getInterestrate();

}
class SBI extends Bank{
    @Override
    void getInterestrate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}
class HDFC extends Bank{
    @Override
    void getInterestrate() {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}

