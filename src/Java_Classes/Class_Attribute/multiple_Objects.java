package Java_Classes.Class_Attribute;

public class multiple_Objects {
    int x =5;

    public static void main(String[] args){
        multiple_Objects myObj = new multiple_Objects();

        multiple_Objects myObj2 = new multiple_Objects();

        myObj2.x =10;
        System.out.println(myObj.x);
        System.out.println(myObj2.x);

    }
}
