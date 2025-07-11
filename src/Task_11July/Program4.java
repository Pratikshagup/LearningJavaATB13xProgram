package Task_11July;

import java.util.ArrayList;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");
        if(cities.contains("Pune")){
            System.out.println("Pune is in list");
        }
        System.out.println("Enter a city name");
        Scanner sc = new Scanner(System.in);
        String city =sc.next();
        if(cities.contains(city)){
            System.out.println(city+" is in the list");
        }
        else System.out.println(city+" is not in the list");
    }
}
