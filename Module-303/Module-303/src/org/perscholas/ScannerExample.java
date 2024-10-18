package org.perscholas;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle");

        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("You entered a radius of " + radius);

        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is " + area);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

    }
}
