package ex_AccessModifier.Criminal;

import ex_AccessModifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
        thief.gun = 100;
        //thief.canIShoot(); Protected function not accessible
        //thief.thisDefault(); Default modifier not accessible
    }
}
