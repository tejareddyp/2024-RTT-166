package M303_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamForEachExample {

    public static void main(String[] args) {

        String[] strArray = {"one", "two", "three", "four", "five"};
        List<String> list = Arrays.asList(strArray);

        list.stream().forEach(e -> System.out.println(e.toUpperCase()));

        list.removeIf(e -> e.startsWith("o"));

        //Both the below are same
        List<String> filteredList2 = list.stream().filter(e -> !e.startsWith("o")).toList();
        List<String> filteredList = list.stream().filter(e -> !e.startsWith("o")).collect(Collectors.toList());

        filteredList.stream().forEach(a -> System.out.println(a));

        List<String> filteredList1 = list.stream()
                .filter(e -> !e.startsWith("o"))
                .filter(e -> !e.startsWith("t"))
                .collect(Collectors.toList());

        filteredList.stream().forEach(a -> System.out.println(a));


    }
}
