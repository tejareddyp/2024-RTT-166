package M303_9;

import java.util.ArrayList;
import java.util.List;

import static jdk.internal.org.jline.utils.Colors.s;

public class CalcRunner {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.setRadius(10.0);
        c.setName("Circle");

        Circle c2 = new Circle();
        c2.setRadius(15.0);
        c2.setName("Circle2");

        Triangle t = new Triangle();
        t.setName("Triangle");
        t.setHeight(10);
        t.setBase(5.0);

        //make a list of shapes but notice that we are using the parent shape
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(c);
        shapes.add(c2);
        shapes.add(t);

        for (Shape s : shapes) {
            double area = s.calculateArea();
            System.out.println("Area for shape: " + s.getName() + " is " + area);
        }


    }
}
