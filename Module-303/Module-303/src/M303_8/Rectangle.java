package M303_8;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle() {

    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
      return width;
    }

    public String toString(){
        return "Square [width=" + width + ", height=" + height + "]";
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return (width * 2) + (height * 2);
    }

    public void notAvailable() {

    }

    protected void partlyAvailable() {
        //protected is available in same package
    }


    }

