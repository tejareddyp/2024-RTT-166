package M303_7;

public class Average {

    public static void main(String[] args) {

        double[] values = { 1.2, 3.4, 8.4, 7.1, 9.2};

        double sum = 0.0;
        for (int i =0; i < values.length; i++) {
            sum = sum + values[i];
        }

        for (double value : values) {
            sum = sum + value;
        }
        double average = sum / values.length;

        System.out.println("Sum of the values is: " + sum);
        System.out.println("Average is " + average);
    }
}
