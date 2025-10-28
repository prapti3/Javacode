package While_loop;

public class while_loop {
    public static void main(String[] args){
        int countdown = 3;
        while(countdown > 0){
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("happy new year");


//        while loop with false condition

        int i = 10;

        while (i < 5) {
            System.out.println("This will never be printed");
            i++;
        }
    }
}
