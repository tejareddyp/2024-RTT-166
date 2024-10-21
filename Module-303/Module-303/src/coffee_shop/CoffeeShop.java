package coffee_shop;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class CoffeeShop {

    private List<Product> products = new ArrayList<>();

    private List<Product> cart = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    private void initProducts() {
        Product p1 = new Product("Small Coffee", 4.99, 0);
        products.add(p1);

        Product p2 = new Product("Large Coffee", 7.99, 0);
        products.add(p2);

        Product p3 = new Product("Sugar Cookie", 5.99, 0);
        products.add(p3);

        Product p4 = new Product("Egg Sandwich", 6.59, 0);
        products.add(p4);
    }

    private void printProductMenu() {
        for (int count = 0; count < products.size(); count++) {
            Product p = products.get(count);
            // count + 1 the complier will recognize the math and increment the value of count
            // before using it to create the string that is printed
            System.out.println((count + 1) + ") " + p.getName() + " \t " + p.getPrice());
        }
        // white space after print
        System.out.println("");
    }

    private int printMainMenu() throws InvalidInputException {
        System.out.println("1) See product menu");
        System.out.println("2) Purchase product");
        System.out.println("3) Checkout");
        System.out.println("4) Exit");

        return readNumberFromUser("\nEnter Selection: ");
    }

    private int readNumberFromUser(String question) throws InvalidInputException {
        System.out.print(question);
        try {
            int selection = scanner.nextInt();
            return selection;
        } catch (Exception e) {
            System.out.println("Invalid input" + e.getMessage());
            throw new InvalidInputException("Invalid input: " + e.getMessage());
        } finally {
            scanner.nextLine();
        }

    }

    public void addProductToCart() {
        // 1 display the items for sale
        printProductMenu();

        // 2 prompt the user to enter an item # to

        try {
            int selection = readNumberFromUser("Enter Product number:");

        if (isSelectedProductValid(selection)) {
            int quantity = readNumberFromUser("Enter quantity to buy:");

            //to make sure user enters a positive number
            if (quantity <= 0) {
                System.out.println("Must buy at least one item");

            } else {

                // we are subtracting 1 from the user input to get the real position in the array
                Product p = products.get(selection - 1);
                p.setQuantity(p.getQuantity() + quantity);

                if (!existsInCart(p)) {
                    cart.add(p);
                }
                System.out.println("Added " + p.getName() + " to your cart.\n");
            }
        } else {
            System.out.println("Invalid item selection");
        }
    } catch (InvalidInputException iie) {
        System.out.println("========here=====");
    }
}

private boolean isSelectedProductValid(int selectedProduct) {
    if (selectedProduct >= 1 && selectedProduct <= products.size()) {
        return true;
    } else {
        return false;
    }
}

private boolean existsInCart(Product purchase) {
    boolean found = false;

    for (Product item : cart) {
        if (item.getName().equals(purchase.getName())) {
            found = true;
            break;
        }
    }
    return found;
}

public void checkout() {
    System.out.println("Items in your cart");

    double subtotal = 0.0;
    for (Product item : cart) {
        System.out.println(item.getName() + " \t " + item.getQuantity() + " \t $" + item.getPrice() + " \t $" + (item.getPrice() * item.getQuantity()));
        subtotal = subtotal + item.getPrice();
    }
    System.out.println("Subtotal\t\t $" + (String.format("%.2f", subtotal)));
    double tax = subtotal * 0.09;
    System.out.println("Tax\t\t\t\t $" + (String.format("%.2f", tax)));

    double total = (subtotal + tax);
    System.out.println("Total\t\t\t $" + String.format("%.2f", total) + "\n");
}

public void start() throws InvalidInputException {
    // this becomes similar to the main method in that it will be where our project starts and runs
    // 1) initialize the products for sale
    initProducts();
    // print the list of products for sale
    //printProductMenu();
    while (true) {
        // print the menu and get back the user selected input
        int selection = printMainMenu();

        if (selection == 1) {
            // print the product menu
            printProductMenu();
        } else if (selection == 2) {
            // purchase product / add to cart
            addProductToCart();
        } else if (selection == 3) {
            //
            checkout();
        } else if (selection == 4) {
            System.out.println("Good bye");

            // we are exiting with a value of 0 means successful exit
            // this ends the program
            System.exit(0);
        } else {
            System.out.println("Invalid command entered " + selection + "\n");
        }
    }
}

public static void main(String[] args) throws InvalidInputException {
    CoffeeShop cs = new CoffeeShop();
    cs.start();
}
}


