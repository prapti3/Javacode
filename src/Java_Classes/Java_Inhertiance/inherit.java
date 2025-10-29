package Java_Classes.Java_Inhertiance;

public class inherit {
}

class Vehicle{
    protected String brand = "Frod";
    public void honk(){
        System.out.println("Tuut, tuiut!!");
    }
}

class Car extends Vehicle{
    private String modelName = "Mustange";
    public static void main(String[] args){
//        create myCar object
        Car myCar = new Car();

        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);

    }
}
