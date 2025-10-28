package Java_Classes.Java_constructor;

public class constructor_Parameter {

//    constructon can take parameters, used to intialize attribute

    int x;

    public constructor_Parameter(int y){
        x = y;
    }

    public static void main(String[] args){
        constructor_Parameter myObj = new constructor_Parameter(3);
        System.out.println(myObj.x);
    }
}
