package ex_AccessModifier;

import org.w3c.dom.ls.LSOutput;

public class LabEx_Private {

}

class Father{
    private int gold = 10;
    int car =1;
    public int bhk3 =1;
}

class Son extends Father{
    void CanUse()
    {
        System.out.println(car);
        System.out.println(bhk3);
    }

}
