package ex_Lab_Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_Mapexample {
    public static void main(String[] args) {
        Map<String,Integer> vehicle = new HashMap();
        vehicle.put("MG Aastror",1);
        vehicle.put("i10",2);
        vehicle.put("Hornet",2);
        vehicle.put("BMW",1);
        vehicle.put("Tesla",5);
        System.out.println("Total Vehicles: " +vehicle.size()); //number of keys

        //Iterator for Map
        for(String key : vehicle.keySet()){
            System.out.println(key+" -> " +vehicle.get(key));
        }

        //Checking for a key
        if(vehicle.containsKey("Hornet")){
            System.out.println("It exists!");
        }
        else System.out.println("It doesn't exists!");

        //clearing map
        vehicle.clear();
        System.out.println("Total Vehicles: " +vehicle.size()); //updated count
    }

}
