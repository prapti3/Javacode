package Java_Classes.Class_Method;

public class Access_Methods_with_Object {

//    create a car object named myCar, call the fullThrottle() and speed() methods on myCas object and run program


//    create fullThrottle() method
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can !!");
    }
//    create speed() method
    public void speed(int maxSpeed){
        System.out.println("Max speed is : " + maxSpeed);
    }

//    inside main, call methods on myCar object

    public static void main(String[] args){
        Access_Methods_with_Object myCar = new Access_Methods_with_Object();
        myCar.fullThrottle();
        myCar.speed(23);
        System.out.println(myCar);
    }



}
