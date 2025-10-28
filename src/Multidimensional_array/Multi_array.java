package Multidimensional_array;

import org.w3c.dom.ls.LSOutput;

public class Multi_array {
    public static void main(String[] args) {
//    array that contains array
//    used to store data in table with rows and columns

        int[][] myNum = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(myNum[1][2]);

        System.out.println("Rows: " + myNum.length);
        System.out.println("Cols in row 0 : "+ myNum[0].length);
        System.out.println("Cols in row 1 : "+ myNum[1].length);

        for (int row = 0; row < myNum.length; row++) {
            for (int col = 0; col < myNum[row].length; col++) {
                System.out.println("myNumbers[" + row + "][" + col + "] = " + myNum[row][col]);
            }
        }


        for(int[] row: myNum){
            for(int num : row){
                System.out.println(num);
            }
        }
    }
}
