package Array;

public class example {
    public static void main(String[] args){
//        create a program thaat calculates avg of different ages

        int ages[] = {20,22,18,35,26,87,70};
        float avg,sum = 0;

//        get the length of array
        int len = ages.length;

//        loop through the elements of the array
        for(int age : ages){
            sum += age;
        }

//        calc avg by diviing it with sum of leng
        avg= sum/len;
        System.out.println("Avg : " + avg);








//        find lowset age among different ages

        int Ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

//        get len of array
        int length = Ages.length;

//        create lowset age var and assign first array elem of ages
        int lowAge = ages[0];

        for(int age : Ages){
            if(lowAge > age) {
                lowAge = age;
            }
        }

        System.out.println("The lowset Age in array is : "+ lowAge);













    }
}
