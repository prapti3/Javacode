package Java_Classes;



public class Java_Classes_Objects {
//    class with name Main -->



        int x = 5;

    /*
    * Everything in java is associated with classes and objects
    * along with attributes and methods
    *
    * car = object
    * car has attribute - weight, color
    * method - drive and brake
    *
    * */



//    create object ==>
//    object is creates from class

    public static void main(String[] args) {
        Java_Classes_Objects myObj = new Java_Classes_Objects();
        System.out.println(myObj.x);

//        multiple objects
        Java_Classes_Objects myObj1 = new Java_Classes_Objects();
        Java_Classes_Objects myObj2 = new Java_Classes_Objects();

        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }

//using multiple classes
    /*
    * create a object of class and access it in another class
    * used for better organization of classes
    * one class has all the attribtues and methods, while other class holds main() method */

}
