package org.perscholas;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Integer;

public class Test {

    public static void main(String[] args) {
//        int i = 77;
//        String str = Integer.toBinaryString(i);
//        System.out.println(str);
//
       // System.out.println(str.charAt(str.length() - 4));
        Scanner sc = new Scanner(System.in);
//
        int number = sc.nextInt();


        String str = String.valueOf(number);
        System.out.println(str);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 8) {
                count = count + 2;
            } else if ((str.charAt(i) == 0) || (str.charAt(i) == 4) || (str.charAt(i) == 6) || (str.charAt(i) == 9)) {
                count++;
            } else {
                continue;
            }
        }
        System.out.println(count);
    }


}


