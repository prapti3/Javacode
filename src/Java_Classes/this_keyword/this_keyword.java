package Java_Classes.this_keyword;

public class this_keyword {

//    refers to current object in method or constructor
//    used to avoid confusion when class attribute have same name as method or constructor parameters

/*
*  Accessing class attribute =====>
*
*
* sometimes constructor or method has a parameter with same name as class variable
* when this happed, parameteres temporarily hides the class variable inside tht method or construcotr
*
*
*
* */

    int x;

//    construcotr with one parameter x
    public this_keyword(int x){
        this.x = x ;
    }
    public static void main(String[] args){
        this_keyword myKey = new this_keyword(4);
        System.out.println(myKey.x);

    }


}
