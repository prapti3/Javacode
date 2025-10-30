package Java_Classes.Date_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args){
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before Formatting : " + myDateObj);
        DateTimeFormatter myFormateObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormateObj);
        System.out.println("After formatting: " + formattedDate);
    }

}
