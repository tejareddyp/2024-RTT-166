package org.perscholas;

import java.text.DecimalFormat;
import java.util.StringJoiner;

public class StringExamples {

    public static void main(String[] args) {

        String s = "abcdef";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(5));
        System.out.println("The length of this string is: " + s.length());
        System.out.println(s.toUpperCase());

        String s1 = "xyz";
        String s2 = "abc123";
        String concat = s.concat("ghijkl");
        System.out.println(concat);
        System.out.println(s.concat(s1));
        System.out.println(s + s1);

        //s1.replaceAll("xyz","aaa");
        System.out.println(s1.replaceAll("xyz", "aaa"));
        System.out.println(s2.replaceAll("\\d", "0"));
        System.out.println(s1.replace("x", "y"));

        //Substring
        String subString1 = "Example of substring:";
        System.out.println(subString1.substring(0, 7));
        System.out.println(subString1.substring(0));
        System.out.println(subString1.indexOf(":"));
        System.out.println(subString1.substring(subString1.indexOf("o")));

        String s3 = "Example.jpg";
        System.out.println(s3.substring(0, s3.lastIndexOf(".")));

        //Convert string to number
        String n = "1234";

        int n1 = Integer.parseInt(n);
        System.out.println(n1);

        int n2 = 65;

        //01234567
        //abc1xyz23

        StringBuffer sb = new StringBuffer();

        sb.append("abc");
        sb.append("123");
        System.out.println(sb);

        //this will insert at position 4
        sb.insert(3, "xyz");

       // System.out.println(sb.toString());
        System.out.println(sb);

        sb.replace(0,3,"ABCDEF");
        System.out.println(sb);

        sb.delete(6,9);
        System.out.println(sb);

        System.out.println("kba example");
        StringBuffer kba = new StringBuffer("ABC");
        kba.replace(0,7,"DEFG").insert(0,12345);
        System.out.println(kba);
        kba.reverse();
        System.out.println(kba);
        kba.delete(0,5);

        System.out.println(kba);

        //String Joiner

        StringJoiner joinNames = new StringJoiner(",");

        joinNames.add("Sunny");
        joinNames.add("Luna");
        joinNames.add("Rain");

        System.out.println(joinNames);

        //formatting

        int i = 1024;
        byte b = 127;
        double d = 1.232, tiny = d / 1000000.0;
        boolean bool = true;
        System.out.format(" This is an integer: %d and this is a byte: %d.\r\n", i, b);
        System.out.format(" This is a double: %.4f and this is tiny: %.4e.\r\n", d, tiny);
        System.out.format(" And this is a String: %s", "This is a string.\r\n");

        //Decimal format

        String pattern = "####,####.##";
        double number = 123456789.123;
        DecimalFormat numberFormat = new DecimalFormat(pattern);
        System.out.println(numberFormat.format(number));

    }
}
