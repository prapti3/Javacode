package Java_IO_Stream.File_input_Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class file_input_stream {
    public static void main(String[] args){
        try(FileInputStream input = new FileInputStream("file.txt")){
        int i;
        while((i = input.read()) != -1){
            System.out.println((char) i);
        }
    }
    catch(IOException e){
        System.out.println("Error reading file.");
    }
}
}