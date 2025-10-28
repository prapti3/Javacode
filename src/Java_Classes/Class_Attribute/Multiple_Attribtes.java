package Java_Classes.Class_Attribute;

public class Multiple_Attribtes {
    String fname = "John";
    String lname = "Done";

    int age = 3;

    public static void main(String[] args){
        Multiple_Attribtes myObj = new Multiple_Attribtes();
        System.out.println(myObj.fname);
        System.out.println(myObj.lname);
        System.out.println(myObj.fname + myObj.lname);
    }
}
