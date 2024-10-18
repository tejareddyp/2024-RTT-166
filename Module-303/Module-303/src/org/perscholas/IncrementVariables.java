package org.perscholas;

public class IncrementVariables {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        int d = 40;
        int e = 50;
        int f = 60;
        int g = 70;

        c = b++;

        System.out.println(c);

        System.out.println(b);

        c = ++d;
        System.out.println(c);

        c = e--;

        System.out.println(e);


        System.out.println(c);

        c = --f;



        System.out.println(c);


    }
}
