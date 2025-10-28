package break_continue;

import java.io.StringBufferInputStream;

public class break_stat {
    public static void main(String[] args){
//        break
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }


//        continue

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }



        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println(i);


        }
    }
}
