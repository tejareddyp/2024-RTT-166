package M303_6;
import java.util.Arrays;

public class DynamicArray {

    public static double[] insert(double[] array, int position, double value) {
        double[] result = new double[array.length + 1];

        //copy all the elements from 0 to the position we inset to the new array
        for (int pos = 0; pos < position; pos++) {
            result[pos] = array[pos];
        }
        //we set the incoming value at the insert position

        result[position] = value;

        //move all the remaining values to the end of the new array
        for ( int pos = position ; pos < array.length ; pos++) {
            result[pos + 1] = array[pos];
        }
        return result;
    }
    public static double[] delete(double[] array, int position) {
        double[] result = new double[array.length - 1];
        for (int pos = 0; pos < position; pos++) {
            result[pos] = array[pos];
                    }
        for ( int pos = position + 1; pos < array.length ; pos++) {
            result[pos - 1] = array[pos];
        }

        return result;
    }
    public static void main(String[] args) {

        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));
        numbers = insert(numbers, 3, 3.5);
        System.out.println(Arrays.toString(numbers));
        numbers = delete(numbers, 8);
        System.out.println(Arrays.toString(numbers));


    }
}
