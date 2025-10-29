package Java_Classes.Java_Super;
//access parent method

class Animal{
    public void animalSound(){
        System.out.println("the animal makes a sound");
    }
}

class Dog extends Animal{
    public void animalSound(){
        super.animalSound(); // call parent method
        System.out.println("The dog says: bow wow");

    }
}
public class Java_super {
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.animalSound();
    }
}

