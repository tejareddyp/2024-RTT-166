package M303_5;

import java.util.ArrayList;
import java.util.List;

public class LoopsExamples {

    public static void main(String[] args) {

        //Count up
        for(int count = 0 ; count < 10 ; count++) {
            System.out.println("For loop iteration" + count);

        }


        //Count down
        for(int count = 10 ; count >= 1 ; count--) {
            System.out.println("For loop iteration" + count);

        }

        String[] strings = {"One", "Two", "Three", "Four", "Five"};

        for (int pos = 0 ; pos < strings.length ; pos++) {
            System.out.println("String at position " + strings[pos]);
        }

        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        for (int pos = 0 ; pos < list.size() ; pos++) {
            System.out.println("String list at position " + list.get(pos));
        }
    }
}
