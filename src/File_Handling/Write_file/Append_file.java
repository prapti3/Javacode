package File_Handling.Write_file;

import java.io.FileWriter;
import java.io.IOException;

public class Append_file {
    public static void main(String[] args){
//        true = Append mode
        try(FileWriter myWriter = new FileWriter("file.txt",true)){
            myWriter.write("\nAppended text!");
            System.out.println("Successfully appended to the file!!");
        }
        catch(IOException e){
            System.out.println("An Error Occured.");
            e.printStackTrace();
        }
    }
}
