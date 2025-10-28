public class code4 {
    /**
     * - Show the difference between ++i and i++
     *- Show the difference between --i and i--
     *- Print values before and after operations
     */

    public static void main(String[] args) {
        int i = 5;
        System.out.println("Original :"+ i);

        // Using pre-increment
        int preIncrement = ++i; // i is incremented first, then assigned

        System.out.println("pre-increment : " + preIncrement);
   

        // Using post-increment
        int postIncrement = i++; // i is assigned first, then incremented
        System.out.println("Post-increment : " + postIncrement);


        // Using pre-decrement
        int j =6;

        int preDecrement = --j; // i is decremented first, then assigned
        System.out.println("pre-decrement : " + preDecrement);
     

        // Using post-decrement
        int postDecrement = j--; // i is assigned first, then decremented
        System.out.println("post-decrement : " + postDecrement);
       
}
}
