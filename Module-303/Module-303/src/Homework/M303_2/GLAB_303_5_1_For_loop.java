package Homework.M303_2;
import java.util.Scanner;

public class GLAB_303_5_1_For_loop {

    public static void main(String[] args) {

        //Example 1: Display a text 5 times

        int n = 5;
        // for loop
        for (int i = 1; i <= n; i++ ) {
            System.out.println("Java is fun");
        }

        //Example 2:  Display Sum of n Natural Numbers

        int sum = 0;
        for (int i = 1 ;i <= 1000 ; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);

        //Example 3: Palindrome

        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        }else
        {
            System.out.println("Entered string/number isn't a palindrome.");
        }
        //Example 4: Pyramid

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }


    }
}
