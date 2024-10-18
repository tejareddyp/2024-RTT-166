package Homework.M303;

import java.util.Scanner;

public class PA_303_5_1_Loops {

    public static void main(String[] args) {

        //Example 1: Print a multiplication table
        for (int i = 1; i <= 12; i++) {
            System.out.println();
            for (int j = 1; j <= 12; j++)
                System.out.print(j * i + " ");
        }

        //Example 2: Find the Greatest Common Divisor

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the first positive integer: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second positive integer: ");
        int n2 = sc.nextInt();

        int gcd = 1;

        for (int k = 2; (k <= n1 && k <= n2); k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }

        System.out.println("GCD of " + n1 + " and " + n2 + " = " + gcd);

        //Example 3: Predict future tuition

        double tuition = 10000;
        int tuitionDoubled = 20000;
        int i = 0;
        while (tuition < tuitionDoubled) {
            tuition = 1.07 * tuition;
            i++;
        }
        System.out.println("Tuition will be doubled in " + i + " years.");
    }
}
