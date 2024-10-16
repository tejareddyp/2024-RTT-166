package my_coffee_shop;

import java.util.*;

public class MyCoffeeShop {

    private Scanner sc = new Scanner(System.in);

    //class level variable that has list of products for sale
    private List<Product> products = new ArrayList<Product>();

    private List<Product> cart = new ArrayList<>();


    private void initProducts() {
        Product p1 = new Product("Small coffee", 3.99, 0);
        products.add(p1);

        Product p2 = new Product("Medium coffee", 4.99, 0);
        products.add(p2);

        Product p3 = new Product("Large coffee", 5.99, 0);
        products.add(p3);

        Product p4 = new Product("Sandwich", 6.99, 0);
        products.add(p4);
    }

    private void printProductMenu() {
        for (int count = 0; count < products.size(); count++) {
            Product p = products.get(count);
            System.out.println((count + 1) + ")" + p.getName() + "\t\t" + p.getPrice());}

            System.out.println();
        }


        private int printMainMenu () {
            System.out.println("1) See product menu");
            System.out.println("2) Purchase product");
            System.out.println("3) Checkout");
            System.out.println("4) Exit");

            System.out.print("\nEnter selection: ");
            return sc.nextInt();
        }

//            try {
//                int selection = sc.nextInt();
//                sc.nextLine();
//                return selection;
//            }
//            catch (Exception e) {
//                System.out.println("Invalid selection " + e.getMessage());
//                return -1;
//            }
//            finally {
//                sc.nextLine();
//            }


        public void addProductToCart() {
        printProductMenu();

        System.out.print("Enter product number: ");
        int selection = sc.nextInt();

        Product p = products.get(selection - 1);
        System.out.print("How many " + p.getName() + " do you want to add?");
         int quantity = sc.nextInt();
         p.setQuantity(quantity);



        if (selection >= 1 && selection <= products.size()) {

           if(!productIsInCart(p)) {
           cart.add(p);  }

            System.out.println("Added " + quantity + " " + p.getName() + " to the cart.\n");
        }
        else {
            System.out.println("Invalid item selection " + selection);
        }

        //we are subtracting 1 from user input to get the real position in the array

    }

    //Check if product is already in cart
    public boolean productIsInCart(Product item) {
        for (int count = 0; count < cart.size(); count++) {
            String productName = cart.get(count).getName();
            if (productName.equals(item.getName())) {
                item.setQuantity(cart.get(count).getQuantity() + item.getQuantity());
                cart.remove(count);
                cart.add(item);
                return true;
            }
        }
        return false;
    }

    public void checkout() {
        System.out.println("Items in your cart are: \n");

        double Total = 0.0;
        double subTotal = 0.0;
        for (Product item : cart) {
           // System.out.println(item.getName() + "\t" + item.getQuantity() + " * $" + item.getPrice());
          Total = Total + (item.getPrice() * item.getQuantity());
            subTotal = ( item.getPrice() * item.getQuantity() );
            System.out.println(item.getName() + "\t" + item.getQuantity() + " * $" + item.getPrice() + " = " + subTotal );
        }



        //Calculate total

        System.out.println();
        System.out.println("Total = $" + String.format("%.2f",Total));
        double tax = Total * 0.05;
        System.out.println("Tax\t\t = " + String.format("%.2f", tax));

        double Amount  = Total + tax;
        System.out.println("Amount due  = $" + String.format("%.2f\n", Amount));
    }

        public void start () {
            //this is similar to main method. this is where our project starts and runs
            //Initialize the products for sale
            initProducts();

            while (true) {
                int selection = printMainMenu();

                if (selection == 1) {
                    printProductMenu();
                }
                else if (selection == 2) {
                  addProductToCart();
                }
                else if (selection == 3) {
                    checkout();
                }
                else if (selection == 4) {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                else {
                    System.out.println("Invalid selection " + selection);
                }
            }
        }


        public static void main (String[] args) {
            MyCoffeeShop cs = new MyCoffeeShop();
            cs.start();
        }
    }

