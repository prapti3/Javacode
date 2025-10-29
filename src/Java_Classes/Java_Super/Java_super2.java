package Java_Classes.Java_Super;



class Animall {
    String type = "Animal";
}

class Dogg extends Animall {
    String type = "Dog";

    public void printType() {
        System.out.println(super.type); // Access parent attribute
    }
}
public class Java_super2 {

    public static void main(String[] args) {
        Dogg myDog = new Dogg();
        myDog.printType();
    }
}

