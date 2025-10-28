package Condition;

public class if_else {
    public static void main(String[] args){
        int weather = 2;
//        1= raining 2 = sunny 3=cloudy

        if(weather ==1){
            System.out.println("bring umbrella");
        }
        else if(weather ==2){
            System.out.println("Wear sunglasses");
        }
        else{
            System.out.println("Just go outside normally");
        }


        int time = 22;
        if(time < 10){
            System.out.println("Good Morning");
        }
        else if(time < 18){
            System.out.println("Good day");
        }
        else {
            System.out.println("Good evening");
        }




//        real world example
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }






    }
}
