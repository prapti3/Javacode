package Method;

public class Recursion {


    static void countdown(int n){
        if(n >0){
            System.out.println(n + " ");
            countdown(n-1);

        }
    }

    public static int sum(int start,int end){
        if (end > start){
            return end + sum(start,end-1);

        }
        else{
            return end;
        }
    }


    public static int sum(int k){
        if(k >0){
            return k + sum(k-1);
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
//        recursion - function call itself
//        provides way to break complicated problems int simple problems

//        add range of numbers
        int result = sum(10);
        System.out.println(result);


//        halting condition

        /*
        * similar to loops can run into problem of infinite looping,
        * resursion method can run into problem of infinite recursion
        * inifinite recursion - method never stops calling itself
        * every recursion method should have halting condition
        * halting mthod - method stops calling itsled
        * */


        int result2 = sum(5,10);
        System.out.println(result2);


//it can easily accidentally write a method that never stops or
// uses too much memory

//        countdown with recursion

        countdown(5);



















    }
}
