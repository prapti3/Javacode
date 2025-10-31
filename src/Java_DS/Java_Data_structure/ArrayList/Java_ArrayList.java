package Java_DS.Java_Data_structure.ArrayList;

import java.util.ArrayList;

public class Java_ArrayList {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add(3,"Nano");
        System.out.println(cars);

//        get() array elements
        var getMethod = cars.get(0);
        System.out.println(getMethod);

//        set()  = change elements
        var setMethod = cars.set(2,"Dance");
        System.out.println(cars);

//        remove() remove element
        var removeMethod = cars.remove(0);
        System.out.println(removeMethod);

//        clear() remove all element
//        cars.clear();
//        System.out.println(cars);

//        size() array list size
         var ArraySize =  cars.size();
        System.out.println(ArraySize);

//        loop through arrayList
        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }

//        for-each loop
        for(String car : cars){
            System.out.println(car);
        }




    }

}
