package Java_Classes.Java_constructor;

public class constructor {
    /*
    * constructor = special method that is used to initialize objects
    * constructor is called when object of class is created
    * it can used to set initial values for object attributess*/

    int x;

//    create a class constructor for constructor class
    public constructor(){
        x =5;
    }

    public static void main(String[] args){
        constructor myObj = new constructor();
        System.out.println(myObj.x);
    }
}
// constructor name == class name
// no return type (void)
//constructor is called when object is created
// all classes have constructor by default;


