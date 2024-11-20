package SBA2;

import java.util.List;

public class Test1 {

    public static long doubleSize(List<Long> arr, long b) {
        // Write your code here

        for (int i = 0; i < arr.size(); i++) {
            if (b == (arr.get(i))) {
                b = b * 2;
            }
        }
        return b;
    }
}


