package Array;

public class loop_through_array {
    public static void main(String[] args){
        String[] cars =  {"Volvo", "BMW", "Ford", "Mazda"};
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }

        int[] num = {10,20,30,40};
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

//        calculate sum of elements
        int[] numbers = {1,2,3,4,5};
        int sum =0;
        for(int i=0;i<numbers.length;i++){
            sum = sum + numbers[i];

        }
        System.out.println("sum of elements :" + sum);


//        loop through array with for-each

        String[] str = {"w","e","r","t"};
        for(String s : str){
            System.out.println(s);
        }
    }
}
