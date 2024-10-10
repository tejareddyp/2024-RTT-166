package Homework.M303;

import java.util.Arrays;
import java.util.Scanner;

public class PA_303_7_1_Array {

    public static void main(String[] args) {
        //Task 1
        int[] array1 = {1, 2, 3};
        System.out.println(Arrays.toString(array1));

        //Task 2
        int[] array2 = {13, 5, 7, 68, 2};


        int m = (array2.length / 2);
        System.out.println("Middle element of array2 is " + array2[m]);

        //Task 3
        String[] str = {"red", "green", "blue", "yellow"};
        System.out.println("Length of array is: " + str.length);

        String[] strCopy = str.clone();
        System.out.println("The cloned array is: " + Arrays.toString(strCopy));

        //Task 4
        int[] array3 = {1, 2, 3, 4, 5};

        System.out.println("First element in the array is " + array3[0]);
        System.out.println("Last element in the array is " + array3[array3.length - 1]);
        System.out.println("Length of array3 is " + array3.length);

        //System.out.println(array3[5]); //Index out of bounds exception
        //array3[5] = 6; Index out of bounds exception

        //Task 5
        int[] array4 = new int[5];

        for (int i = 0; i < array4.length; i++) {
            array4[i] = i;
        }
        System.out.println(Arrays.toString(array4));

        //Task 6
        int[] array5 = new int[5];

        for (int i = 0; i < array5.length; i++) {
            array5[i] = i * 2;
        }
        System.out.println(Arrays.toString(array5));

        //Task 7
        String[] str1 = {"one", "two", "three", "four", "five"};
        System.out.println(Arrays.toString(str1));
        int mid = str1.length / 2;

        for (int i = 0; i < str1.length; i++) {
            if (i != mid) {
                System.out.println(str1[i]);
            }
        }

        //Task 8
        String tempFirst = str1[0];
        String tempMiddle = str1[str1.length / 2];

        str1[str1.length / 2] = tempFirst;
        str1[0] = tempMiddle;

        System.out.println("New array after swapping first and middle element " + Arrays.toString(str1));

        //Task 9
        int[] array6 = {4, 2, 9, 13, 1, 0};
        Arrays.sort(array6);

        System.out.println("Array in ascending order: " + Arrays.toString(array6));
        System.out.println("The smallest number is " + array6[0]);
        System.out.println("The largest number is " + array6[array6.length - 1]);


        //Task 10
        String[] str2 = {"1", "two", "three", "four", "5.0"};
        System.out.println(Arrays.toString(str2));

        //Task 11
        Scanner sc = new Scanner(System.in);
        System.out.println("How many favorite things do you have? ");
        int n = sc.nextInt();

        String[] str3 = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your favorite thing: ");
            str3[i] = sc.next();

        }

        System.out.println("Your favorite things are: ");

        for (int i = 0; i < n; i++) {
            System.out.print(str3[i] + " ");
        }
    }


}

