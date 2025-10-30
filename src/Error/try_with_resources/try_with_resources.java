package Error.try_with_resources;

import java.io.FileOutputStream;
import java.io.IOException;

public class try_with_resources {

    public static void main(String[] args) {
        // resource is opened inside try()
        try (FileOutputStream output = new FileOutputStream("filename.txt")) {
            output.write("Hello".getBytes());
            // no need to call close() here
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}
