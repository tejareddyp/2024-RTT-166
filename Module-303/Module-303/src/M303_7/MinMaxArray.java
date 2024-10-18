package M303_7;

public class MinMaxArray {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int min = values[0];
        int max = values[0];

        for (int v : values) {
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }

            System.out.println("Min value = " + min );
            System.out.println("Max value = " + max);

        }
    }
}
