package Java_Classes.Non_Access_Modifier;

public class non_access_modifier {

    //non-access modifier do not control visibilty , but instead add other features to
    // classes, method , attribute

//    commonly used = final, static, abstract

    /*
    * final = dont want to override/ change attribute values */

    final int x = 10;
    static void myStaticMethod(){
        System.out.println("Static method can be called without creating object");
    }


    public static void main(String[] args){
        non_access_modifier myObj = new non_access_modifier();
//        myObj.x =30;

        myStaticMethod();
        non_access_modifier.myStaticMethod();


    }

    /*
    * static = belongs to class, not to any specific object
    * means you can call it without creating an object of class*/



}
