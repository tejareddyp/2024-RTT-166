package M303_6;

public class ArraysExamples {

    public static void main(String[] args) {

        //All elements will be zero
        int[] numbers = new int[10];

        //print all elements of array
        for( int pos = 0 ; pos < numbers.length ; pos++ ) {
            numbers[pos] = pos;
            System.out.println("number[" + pos + "] = " + numbers[pos] + " ");
        }

        int[] numbers1 = {1,2,3,4,5};
    }
}
