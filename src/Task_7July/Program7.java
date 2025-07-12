package Task_7July;

public class Program7 {
    public static void main(String[] args) {

        System.out.println("Max Speed is: " + SpeedLimit.max_limit);
    }
}

interface SpeedLimit{
int max_limit = 120;

}

class Car1 implements SpeedLimit{

}