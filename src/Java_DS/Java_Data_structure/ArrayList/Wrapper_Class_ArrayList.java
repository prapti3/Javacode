package Java_DS.Java_Data_structure.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Wrapper_Class_ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> myNum = new ArrayList<Integer>();
        myNum.add(10);
        myNum.add(20);
        myNum.add(30);
        for(int i: myNum){
            System.out.println(i);
        }
    }
}
