package Java_Classes.Access_Modifiers;

class person{
    public String name = "John";
    private int age = 30;


    public static void main(String[] args){
        person p = new person();
        System.out.println(p.age);
    }
}
public class access_Modifier {
    /*
    * access modifier = controls access level
    * non-access modifier = do not control access level, provides other functionality
    * */


//    public = class accessible by any other class
//    default = class accessible by classes in same package.
//    - used when you don't specify modifier



    /*for attributes, methods,constructor
    * 1. public = code is accessible for all classes
    * 2. private = code is only accessible within declared class
    * 3. defualt = code is onlt accessbiel in same package
    * 4. protected = code is accessible in same package and subclasses */


    /*
    * public example = public park, any one can enter
    * private example = your house key, only you can use it
    *
    * */

    public static void main(String[] args){
        person p = new person();
        System.out.println(p.name);
        //System.out.println(p.age); //error : age is private
    }
}

