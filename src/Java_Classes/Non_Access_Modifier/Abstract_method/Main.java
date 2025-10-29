package Java_Classes.Non_Access_Modifier.Abstract_method;


//abstract class
abstract class Main{
    public String fname = "John";
    public int age = 24;
    public abstract void study();  //abstract method


    public static void main(String[] args){

    }
}

//subclass (inherit from Main)
class Student extends Main {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}

//public class Main {
//}
