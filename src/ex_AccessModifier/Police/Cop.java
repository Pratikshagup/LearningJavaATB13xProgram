package ex_AccessModifier.Police;

import java.sql.SQLOutput;

public class Cop {
    public int gun;
    private String iCard;

    public Cop(int bullet)
    {
        this.gun = bullet; //calls variable of same class in constructor
    }

    protected void canIShoot(){
        System.out.println("Yes you can!!");
    }

    void thisDefault(){
        System.out.println("Hi from default modifier");
    }
}

