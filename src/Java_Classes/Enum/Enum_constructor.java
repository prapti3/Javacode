package Java_Classes.Enum;


enum level{
    // Enum constants (each has its own description)
    LOW("Low level"),
    MEDIUM("Medium level"),
    HIGH("High level");

    // Field (variable) to store the description text
    private String description;

    // Constructor (runs once for each constant above)
    private level(String description) {
        this.description = description;
    }

    // Getter method to read the description
    public String getDescription() {
        return description;
    }
}
public class Enum_constructor {
    public static void main(String[] args) {
        level myVar = level.MEDIUM; // Pick one enum constant
        System.out.println(myVar.getDescription()); // Prints "Medium level"
    }
}
