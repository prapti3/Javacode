package Java_Classes.Java_Packages;

import java.util.Scanner;
import java.util.*;

public class Scanner_package {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username : ");


        String userName = myObj.nextLine();
        System.out.println("Username is : " + userName);
    }

}
