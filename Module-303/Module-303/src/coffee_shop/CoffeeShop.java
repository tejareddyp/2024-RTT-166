package coffee_shop;

import coffee_shop.InvalidInputException;
import coffee_shop.Product;

import java.util.ArrayList;
import java.util.List;

import java.sql.SQLOutput;
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

        Product p3 = new Product("Sugar Cookie", 3.99, 0);
        products.add(p3);

        Product p4 = new Product("Ginger Cookie", 3.99, 0);
        products.add(p4);

        Product p5 = new Product("Egg Sandwich", 6.59, 0);
        products.add(p5);

        List<Product> loaded = new ProductLoader().loadProducts();

        // add all the products we load to our product list
        products.addAll(loaded);


        //sort list by price
        List<Product> sorted = products.stream().sorted(Comparator.comparing(Product::getPrice)).toList();


        //this will modify the original list ...using stream will not modify the original list
        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getName));
      //  products.forEach(p -> System.out.println(p));

        sortByPrice(products);
    }

    private List<Product> sortByPrice(List<Product> source) {
        // convert the list to an array
        for (int outer = 0; outer < source.size() - 1; outer++) {
            for (int inner = outer + 1; inner < source.size(); inner++) {
                Product p0 = source.get(outer);
                Product p1 = source.get(inner);

                if (p0.getPrice() > p1.getPrice()) {
                    //Product temp = source.get(outer);
                    source.set(inner, p0);
                    source.set(outer, p1);
                }
            }
        }
        products.forEach(p -> System.out.println(p));

        return null;
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
        System.out.println("5) Product search");
        if ( cart.size() > 0 ) {
            System.out.println("6) Remove item");
        }
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
            if ( scanner.hasNextLine() ) {
                scanner.nextLine();
            }
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

                    if (!isSelectedProductValid(p)) {
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

    public void productSearch() {
        System.out.println("Enter product name to search:");
        String search = scanner.nextLine();

        List<Product> results = products.stream().filter(p -> p.getName().contains(search)).toList();

        //to make it case insensitive then use toLowerCae or toUpperCase
        //List<Product> results = products.stream().filter(p -> p.getName().toLowerCase().contains(search.toLowerCase())).toList();


        //print result list using lambda
        if ( results.isEmpty() ) {
            System.out.println("No results found fro input " + search + ".\n");
        }
        else {
        results.forEach(p -> System.out.println(p)); }
    }

//    public void removeItemFromCart() {
//        System.out.println(Arrays.toString(cart.toArray()));
//        System.out.println("Which product do you want to remove? ");
//
//        String search = scanner.nextLine();
//        for (Product item : cart) {
//            if (item.getName().equals(search)) {
//                cart.remove(item);
//                System.out.println(Arrays.toString(cart.toArray()));
//            } else {
//                System.out.println("Product is not in your cart");
//            }
//        }
//
//    }

    public void deleteProduct() {
        System.out.println("=============== DELETE PRODUCT ===============");

        printProductMenu(cart);

        try {
            int selection = readNumberFromUser("Enter product number to remove:");

            // do some error checking here on both of these
            int quantity = readNumberFromUser("Enter quantity to remove:");

            // lets assume the user only enters valid data
            Product remove = cart.get(selection-1);

            if ( remove.getQuantity() < quantity ) {
                // this is the case where there are 5 in the cart and we want to remove 3
                remove.setQuantity(remove.getQuantity() - quantity);
            } else {
                // this remove the item from the cart
                cart.remove(selection - 1);
            }

        } catch ( Exception e) {
            System.out.println("Invalid product selection");
        }
    }



    public void start() throws InvalidInputException {
        // this becomes similar to the main method in that it will be where our project starts and runs
        // 1) initialize the products for sale
        initProducts();
        // print the list of products for sale
        //printProductMenu();
        while (true) {

            try {
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
                } else if (selection == 5) {
                    productSearch();
                } else if ((selection == 6 && cart.size() > 0)) {
                    deleteProduct();
                } else {
                    System.out.println("Invalid command entered " + selection + "\n");
                }
            } catch (Exception e) {
                System.out.println("Invalid input\n ");
            }
        }

    }

    public static void main(String[] args) throws InvalidInputException {
        CoffeeShop cs = new CoffeeShop();
        cs.start();
    }
}



