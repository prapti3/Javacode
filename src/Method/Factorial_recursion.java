package Method;

public class Factorial_recursion {
    static int factorial(int n){
        if (n >1){
            return n * factorial(n-1);
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args){
        System.out.println("factorial of 5 is: "+ factorial(5));
    }
}
