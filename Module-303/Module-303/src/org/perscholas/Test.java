package org.perscholas;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Test {

    public String add(double a, String b) {
        String s = (  a + b );
        return s;
    }

    public String add(double a , double b) {
        double result = a + b;
        return (String.format("%.2f",result));
    }

    public String add(String a, String b) {
        String s = ("\"" + a + "," + "\"" + b + "!\"");
        return s;
    }

    public static void main(String[] args) {
    System.out.println("\"" + a + "," + "\"" + b + "!\"");



    }

    }