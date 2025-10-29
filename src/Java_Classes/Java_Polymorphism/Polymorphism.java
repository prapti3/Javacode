package Java_Classes.Java_Polymorphism;


class Animal{
    public void animalSound(){
        System.out.println("the animal makes a sound");
    }
}

class pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: bow wow");
    }
}

public class Polymorphism {

    public static void main(String[] args){
        Animal myAnimal = new Animal();
        Animal myPig = new pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();


    }
}