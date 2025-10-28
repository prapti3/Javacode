package Java_Classes.Class_Attribute;

public class Modify_Attribute {
    int x;
    int y = 10;

    public static void main(String[] args){
        Modify_Attribute myObj = new Modify_Attribute();
        myObj.x = 40;
        System.out.println(myObj.x);

//        override existing value
        Modify_Attribute myObj2 = new Modify_Attribute();
        myObj2.y =30;
        System.out.println(myObj2.y);
    }
}
