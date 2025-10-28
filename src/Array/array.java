package Array;

public class array {
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        int[] myNum = {10,20,30,40};
        System.out.println(cars[0]);
        System.out.println(myNum[3]);
        System.out.println(myNum.length);

//        using new keyword - makes empty array with space for a fixed number of eleement
        String[] car = new String[4];
        car[0] = "Volvo";
        car[1] = "BMW";
        car[2] = "Ford";

        System.out.println(car[2]);


//        // With new
//        String[] cars = new String[] {"Volvo", "BMW", "Ford", "Mazda"};
//
//// Shortcut (most common)
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    }
}
