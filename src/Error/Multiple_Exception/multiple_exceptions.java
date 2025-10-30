package Error.Multiple_Exception;

public class multiple_exceptions {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);  // ArrayIndexOutOfBoundsException
            int result = 10 / 0;              // ArithmeticException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index does not exist.");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        catch (Exception e) {
            System.out.println("Something else went wrong.");
        }
    }
}
//Explanation: Only the first exception (ArrayIndexOutOfBoundsException) is thrown, so only the first matching catch runs.



//try {
//int result = 10 / 0;
//int[] numbers = {1, 2, 3};
//  System.out.println(numbers[10]);
//}
//        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//        System.out.println("Math error or array error occurred.");
//}