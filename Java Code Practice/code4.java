public class code4 {
    /**
     * - Show the difference between ++i and i++
     *- Show the difference between --i and i--
     *- Print values before and after operations
     */

    public static void main(String[] args) {
        int i = 5;

        System.out.println("Initial value of i: " + i);

        // Using pre-increment
        int preIncrement = ++i; // i is incremented first, then assigned
        System.out.println("After pre-increment (++i): " + preIncrement);
        System.out.println("Value of i after pre-increment: " + i);

        // Resetting i for clarity
        i = 5;
        System.out.println("Reset value of i: " + i);

        // Using post-increment
        int postIncrement = i++; // i is assigned first, then incremented
        System.out.println("After post-increment (i++): " + postIncrement);
        System.out.println("Value of i after post-increment: " + i);

        // Resetting i for clarity
        i = 5;
        System.out.println("Reset value of i: " + i);

        // Using pre-decrement
        int preDecrement = --i; // i is decremented first, then assigned
        System.out.println("After pre-decrement (--i): " + preDecrement);
        System.out.println("Value of i after pre-decrement: " + i);

        // Resetting i for clarity
        i = 5;
        System.out.println("Reset value of i: " + i);

        // Using post-decrement
        int postDecrement = i--; // i is assigned first, then decremented
        System.out.println("After post-decrement (i--): " + postDecrement);
        System.out.println("Value of i after post-decrement: " + i);
}
}
