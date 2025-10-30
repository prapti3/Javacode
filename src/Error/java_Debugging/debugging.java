package Error.java_Debugging;

public class debugging {

    public static void main(String[] args){
        int  x =10;
        int y = 0;

        System.out.println("Before division");
        int result = x/y; //error - crashed
        System.out.println("Result: " + result);
    }
}
