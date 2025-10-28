package Java_Classes.Java_constructor;

public class example {
    int modelYear;
    String modelName;

    public example(int year, String name){
        modelYear = year;
        modelName = name;


    }

    public static void main(String[] args){
        example myCar = new example(2000,"Prapti");
        System.out.println(myCar.modelName +" "+ myCar.modelYear);
    }
}
