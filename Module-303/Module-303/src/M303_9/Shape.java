package M303_9;

public abstract class Shape implements AreaCalculation {

    private static double PI = 3.14159;
    private String name;

    public abstract double calculatePerimeter();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
