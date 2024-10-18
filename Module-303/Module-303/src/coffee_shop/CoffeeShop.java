//package coffee_shop;
//
//import java.util.ArrayList;
//import java.util.*;
//import java.util.Scanner;
//
//public class CoffeeShop {
//
//    private List<Product> products = new ArrayList<>();
//
//    private Scanner scanner = new Scanner(System.in);
//
//    private void initProducts() {
//        Product p1 = new Product("Small Coffee", 4.99, 0);
//        products.add(p1);
//
//        Product p2 = new Product("Large Coffee", 7.99, 0);
//        products.add(p2);
//
//        Product p3 = new Product("Sugar Cookie", 5.99, 0);
//        products.add(p3);
//
//        Product p4 = new Product("Egg Sandwich", 6.50, 0);
//        products.add(p4);
//    }
//
//    private void printProductMenu() {
//        for ( int count = 0 ; count < products.size() ; count++ ) {
//            Product p = products.get(count);
//            // count + 1 the complier will recognize the math and increment the value of count
//            // before using it to create the string that is printed
//            System.out.println((count+1) + ") " + p.getName() + " \t " + p.getPrice());
//        }
//        // white space after print
//        System.out.println("");
//    }
//
//    private int printMainMenu() {
//        System.out.println("1) See product menu");
//        System.out.println("2) Purchase product");
//        System.out.println("3) Checkout");
//        System.out.println("4) Exit");
//
//        return readNumberFromUser("\nEnter selection : ");
//    }
//
//    private int readNumberFromUser(String question) throws InputMismatchException {
//        System.out.print(question);
//        try {
//            int selection = scanner.nextInt();
//            return selection;
//        }
//        catch (Exception e) {
//            System.out.println("Invalid input");
//            throw new InputMismatchException("Invalid input: " + e.getMessage());
//        }
//        finally {
//            scanner.nextLine();
//        }
//    }
//
//    public void addProductToCart() {
//        // 1 display the items for sale
//        printProductMenu();
//
//        // 2 prompt the user to enter an item # to buy
//        System.out.print("Enter product number:");
//        int selection = scanner.nextInt();
//        scanner.nextLine();
//
//
//        // we are subtracting 1 from the user input to get the real position in the array
//
//        Product p = products.get(selection - 1);
//        cart.add(p);
//        System.out.println("Added " + p.getName() + " to your cart.\n");
//    }
//
//
//
//    public void start() {
//        // this becomes similar to the main method in that it will be where our project starts and runs
//        // 1) initialize the products for sale
//        initProducts();
//
//        // 2) print the list of products for sale
//        printProductMenu();
//    }
//
//    public static void main(String[] args) {
//        CoffeeShop cs = new CoffeeShop();
//        cs.start();
//    }
//}
//
