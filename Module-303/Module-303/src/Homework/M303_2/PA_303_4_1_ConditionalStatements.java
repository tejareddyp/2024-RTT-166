package Homework.M303_2;

import java.util.Scanner;

public class PA_303_4_1_ConditionalStatements {

    public static void main(String[] args) {

        //First and second  problem

        int x = 7;

        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }

        //Third  problem

        int x1 = 1;

        if (x1 < 10) {
            System.out.println("Less than 10");
        } else if ((x1 > 10) && (x1 < 20)) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than 20");
        }

        //Fourth problem

        if ((x1 < 10) || (x1 > 20)) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }

        //Fifth problem

        System.out.println("Enter your score: ");
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if ((score > 90) && (score <= 100)) {
            System.out.println("Your grade is A");
        } else if ((score > 80) && (score <= 89)) {
            System.out.println("Your grade is B");
        } else if ((score > 70) && (score <= 79)) {
            System.out.println("Your grade is C");
        } else if ((score > 60) && (score <= 69)) {
            System.out.println("Your grade is D");
        } else if ((score >= 0) && (score < 60)) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Score out of range");
        }

        //Sixth problem

        Scanner day = new Scanner(System.in);
        System.out.println("Enter your day: ");
        int day1 = day.nextInt();

        switch (day1) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                      System.out.println("Out of range");
        }


    }
}
