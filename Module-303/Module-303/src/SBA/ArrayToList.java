//package SBA;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Arrays;
//import java.lang.String;
//
//public class ArrayToList {
//
//    ArrayList<String> arrayToList;
//
//    ArrayToList() {
//        arrayToList = new ArrayList<>();
//    }
//
//    void convert(String[] a) {
//
//        for (int i = 0; i < a.length; i++) {
//            arrayToList.add(a[i]);
//            System.out.println("I have added the string:" + a[i] + " at index: " + i);
//        }
//    }
//
//    void replace(int idx) {
//        arrayToList.set(idx, "");
//    }
//
//
//    ArrayList<String> compact() {
//        ArrayList<String> newList = new ArrayList<>();
//        for (int i = 0; i < arrayToList.size(); i++) {
//            if (arrayToList.get(i).equals("")) {
//                continue;
//            } else {
//                newList.add(arrayToList.get(i));
//            }
//        }
//        return newList;
//    }
//}
//
//public static void main(String[] args) {
//    ArrayList arrayList = new ArrayList();
//    String[] array = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//
//    arrayList.convert(array);
//    arrayList.replace(3);
//    arrayList.compact();
//
//    System.out.println(arrayList.compact());
//}
//        }
//
//
//
