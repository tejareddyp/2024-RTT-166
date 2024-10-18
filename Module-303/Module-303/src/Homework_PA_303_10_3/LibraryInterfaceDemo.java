package Homework_PA_303_10_3;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        KidUser k1 = new KidUser();


        k1.registerAccount(10);
        k1.requestBook("kids");

        k1.registerAccount(18);
        k1.requestBook("Fiction");

        AdultUser a1 = new AdultUser();

        a1.registerAccount(5);
        a1.requestBook("Kids");

        a1.requestBook("Fiction");
        a1.registerAccount(23);
    }
}
