package Java_Classes.Java_Encapsulation;

public class encap {
    private String name; // private = restricted access

    //getter
    public String getName(){
        return name;
    }

//    Setter
    public void setName(String newName){
        this.name = newName;
    }



    public static void main(String[] args){
        encap myObj = new encap();
        myObj.name = "John"; //error
        System.out.println(myObj.name); // error






    }
}


/*
* Why Encapsulation ?
* - better control of class attributes and method
* class attributes can be make read-only or write-only
* flexible : can change one part of code without affecting other part
* increased security of data
*
* */