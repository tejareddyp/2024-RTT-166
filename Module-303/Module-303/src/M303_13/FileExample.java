package M303_13;

import java.io.File;

public class FileExample {

    public static void main(String[] args) {
        //main constructor is the name of the file
        //this can include partial or full path


        File file = new File("src\temp.txt");

        System.out.println(file.getAbsolutePath());
        System.out.println("exists: " + file.exists());
        System.out.println("is Directory? " + file.isDirectory());
        System.out.println("is hidden " + file.isHidden());
        System.out.println("read only " + file.canRead());
        System.out.println("write only " + file.canWrite());
        System.out.println("can execute " + file.canExecute());
        System.out.println("size " + file.length());

        if (file.isDirectory()) {

           File[] files = file.listFiles();
           for (File f : files) {
               System.out.println(f.getName());
           }



        }

    }
}
