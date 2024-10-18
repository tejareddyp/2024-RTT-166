package M303_13;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerWriter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {
            File file = new File("src/tem2.txt");
            PrintWriter pw = new PrintWriter(file);

            System.out.print("Enter a string to write to the file: ");

            String input = sc.nextLine();
            pw.println(input);

            System.out.println(input);

            pw.flush();
        }
        catch (Exception e) {

        }
    }
}
