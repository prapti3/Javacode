package File_Handling.Write_file;

import java.io.FileWriter;
import java.io.IOException;

public class write_to_file {
    public static void main(String[] args){
        try{
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        }
        catch(IOException e){
            System.out.println("An error Occured");
            e.printStackTrace();
        }
    }
}
