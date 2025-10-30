package File_Handling.Read_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read_files {
    public static void main(String[] args){
        File myObj = new File("file.txt");

        try(Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }
            catch(FileNotFoundException e){
                System.out.println("An error Occured !!");
                e.printStackTrace();
            }


    }
}
