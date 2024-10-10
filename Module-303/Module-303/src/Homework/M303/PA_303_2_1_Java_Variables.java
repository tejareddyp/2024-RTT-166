package Homework.M303;

public class PA_303_2_1_Java_Variables {
    //Practice Assignment
    //Core Java - Variables
    public static void main(String[] args) {
        //Declaring two integer variables, adding them and printing the result

        int a = 10;
        int b = 20;

        int addInt = a + b;
        System.out.println("Adding two integers: " + addInt);

        //Declaring two double variables, adding them and printing the result
        double d1 = 14.56;
        double d2 = 72.45;

        double addDouble = d1 + d2;
        System.out.println("Adding two doubles: " + addDouble);

        //Adding integer variable and double variable
        int i1 = 4174;
        double d3 = 754.0343;


        double sum = i1 + d3;
        System.out.println("Sum of integer and double: " + sum);

        //Dividing two integer variables

        int i2 = 87423;
        int i3 = 78;

        int div1 = i2 / i3;
        System.out.println("Result of integer division: " + div1);

        //Typecasting int i2 to double and dividing

        double div2 = (double) i2 / i3;
        System.out.println("Result of double divided by an integer: " + div2);

        //Dividing two double variables

        double d4 = 478.3;
        double d5 = 72.123;

        double d6 = d4 / d5;
        System.out.println("Result of double divided by double: " + d6);

        System.out.println(("Changing double to int: " + (int) d6));

        int x = 5;
        int y = 6;
        double q = y / x;

        System.out.println("y/x = " + q);

        q = (double) y;

        System.out.println("New value of q = " + q);

        //Calculating total cost after tax for Coffee, Smoothie, Tea

        double SALES_TAX = 0.86;

        double coffee = 4.79;
        double tea = 3.60;
        double latte = 5.99;

        double subTotal;
        double totalSale;

        subTotal = (3 * coffee) + (4 * tea) + (2 * latte);
        totalSale = subTotal * SALES_TAX;

        System.out.println("Total sale = " + (String.format("%.2f", totalSale)) );



    }

}

