package Java_Classes.this_keyword;

public class Calling_constructor_from_another_constructor {
    //this() to call constructor in same class
    //useful when you want to provide default values or
    // reuse initialization code instead of repeating it

    int modelYear;
    String modelName;

//    constructor with one parameter
    public Calling_constructor_from_another_constructor (String modelName){
        // Call the two-parameter constructor to reuse code and set a default year
//        this(2020, modelName);


    }


}


//when to use this?
/*
* when a constructor or method has a parameter with same name as class variable
* use "this" to update the class varaible  correctly
* to call another constructor in same class nand reuse code*/