package Condition;

public class Nested_if {
    public static void main(String[] args){
        int x =12;
        int y = 25;

        if(x > 10){
            System.out.println("x is greater than 10");
            if(y > 20){
                System.out.println("y is also greater than 20");
            }
        }

        int age = 20;
        boolean isCitizen = true;

        if(age >= 18) {
            System.out.println("Out enoguh to vote");

            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
            } else {
                System.out.println("but you must be a citizen to vote");
            }
        }
            else{
                System.out.println("not old enough to vote");

        }























    }

}
