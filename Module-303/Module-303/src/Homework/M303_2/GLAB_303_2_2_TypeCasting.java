package Homework.M303_2;

public class GLAB_303_2_2_TypeCasting {

    public static void main(String[] args) {
        int x = 20;
        double y = 40.5;
        long p = 30;
        float q = 10.60f;

        // int z = x + y; (1) // Error; cannot convert from double to int.
        double z = x + y;
        System.out.println("Sum of two numbers: " + z);

        // long r = p - q; // (2) // Error; cannot convert from float to long.
        float r = p - q;
        System.out.println("Subtraction of two numbers: " + r);

        //Automatic type promotion example

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        // Expression:
        double result = (f * b) + (i / c) - (d * s);
        //Result after all the promotions are done.
        System.out.println("result = " + result);

        //Explicit test

        double dd = 100.04;
        // explicit type casting
        long l = (long) dd;
        int ii = (int) l;
        System.out.println("Double value " + dd);
        System.out.println("Long value " + l);
        System.out.println("Int value " + ii);

        byte bb;
        int zz = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        bb = (byte) zz;
        System.out.println("zz = " + zz + " b = " + bb);
        System.out.println("Conversion of double to int.");

        zz = (int) dou;
        System.out.println("dou = " + dou + " bb = " + zz);
        System.out.println("Conversion of double to byte.");

        bb = (byte) dou;
        System.out.println("dou = " + dou + " bb = " + bb);

    }

}
