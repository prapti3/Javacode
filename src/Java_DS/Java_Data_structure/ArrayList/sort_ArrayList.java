package Java_DS.Java_Data_structure.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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


    }
}
