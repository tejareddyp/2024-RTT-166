package org.perscholas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSetExample {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(2);
        intList.add(3);
        intList.add(3);
        intList.add(5);

        for (Integer i : intList) {
            System.out.println(i);
        }


        Iterator<Integer> iterator = intList.iterator();

        while (iterator.hasNext()) {
            Integer i = iterator.next();

            if (i == 3) {
                iterator.remove();
            }
        }
        System.out.println("=============");
    }

}
