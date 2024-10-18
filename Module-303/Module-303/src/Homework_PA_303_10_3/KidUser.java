package Homework_PA_303_10_3;

public class KidUser implements LibraryUser{

    int age;
    String bookType;

    public void registerAccount(int age) {
        if ( age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        }
        else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    public void requestBook(String category) {
        if (category.equals("kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        }
        else {
            System.out.println("Oops, you are allowed to take only kids books");
        }

    }
}
