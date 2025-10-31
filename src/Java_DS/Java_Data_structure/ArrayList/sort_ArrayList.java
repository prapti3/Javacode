package Java_DS.Java_Data_structure.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sort_ArrayList {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);
        for(String i : cars){
            System.out.println(i);
        }

        var bikes = new ArrayList<String>();
        List<String> MotorBike = new ArrayList<>();



    }
}
