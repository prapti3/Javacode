package File_Handling.Create_File;

import java.io.File;
import java.io.IOException;
import java.io.*;

public class create_file {
    public static void main(String[] args){
        try{
            File myObj = new File("filename.txt");
            if(myObj.createNewFile()){
                System.out.println("File Created: " + myObj.getName());

            }
            else{
                System.out.println("File already exists");
            }
        }
        catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace(); // print error details
        }
    }
}
