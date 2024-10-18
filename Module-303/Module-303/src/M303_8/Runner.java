package M303_8;

public class Runner {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        System.out.println("Area of r1 is " + r1.calculateArea());
        System.out.println("Perimeter of r1 is " + r1.calculatePerimeter());

        r1.setHeight(50);
        r1.setWidth(10);
        r1.notAvailable();
        r1.partlyAvailable();

        System.out.println("New Area of r1 is " + r1.calculateArea());
        System.out.println("New Perimeter of r1 is " + r1.calculatePerimeter());

        Rectangle r2 = new Rectangle(10, 20);
        System.out.println(r2.toString());
        System.out.println("Area of r2 is " + r2.calculateArea());
        System.out.println("Perimeter of r2 is " + r2.calculatePerimeter());
    }
}
