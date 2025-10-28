package Condition;

public class ternanry_operator {
    public static void main(String[] args){
        int time = 20;
        String result = (time < 18) ? "Good day" : "Good evening";
        System.out.println(result);


        int time2 = 22;
        String message = (time2 > 12) ? "good morning"
                : (time2 < 18) ? "Good afternoon"
                : "Good evening";
        System.out.println(message);
    }
}
