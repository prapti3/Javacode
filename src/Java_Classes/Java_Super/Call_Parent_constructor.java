package Java_Classes.Java_Super;


class Aanimal {
    Aanimal() {
        System.out.println("Animal is created");
    }
}

class Ddog extends Animal {
    Ddog() {
        super(); // Call parent constructor
        System.out.println("Dog is created");
    }
}

public class Call_Parent_constructor {
    //    use super() to call constructor of parent class
//    useful for reusing initialization code
    public static void main(String[] args) {
        Ddog myDog = new Ddog();
        Aanimal myAn = new Aanimal();
    }
    }
