package Java_Classes.Anonymous_Class;
// Normal class
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        // Anonymous class that overrides makeSound()
        Animal myAnimal = new Animal() {
            public void makeSound() {
                System.out.println("Woof woof");
            }
        }; // semicolon is required to end the line of code that creates the object

        myAnimal.makeSound();
    }
}
