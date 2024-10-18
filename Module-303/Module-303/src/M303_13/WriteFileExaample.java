package M303_13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExaample {

    public static void main(String[] args) {

        File file = new File("src/temp1.txt");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write("Hello World\n");
            bw.write("Line 2\n");
            bw.write("Line 3\n");
            bw.write("Line 4\n");

            bw.flush();

            bw.close();

        }
        catch (IOException e) {
            e.printStackTrace();

        }


    }
}
