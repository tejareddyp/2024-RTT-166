package M303_13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileContent {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/temp.txt");

        try{
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        while((st = br.readLine()) != null ) {

            System.out.println(st);}

        }
        catch (Exception e) {
            e.printStackTrace();
            }
        }
    }

