package Task_7July;

public class Program8 {
    public static void main(String[] args) {
        Playable instrument;
        instrument = new Guitar();
        instrument.play();
        instrument = new Piano();
        instrument.play();

    }
}
interface  Playable{
    void play();
}
class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Piano");
    }
}


