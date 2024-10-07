package Homework.M303_2;

import java.util.Arrays;
public class GLAB_303_3_1_StringMethods {

    public static void main(String[] args) {
        //Length demo

        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length());

        //IsEmpty example

        String s1 = "";
        String s2 = "hello";
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());
        
        //Trim method

        String s3="  hello   ";
        System.out.println(s3+"how are you");        // without trim()
        System.out.println(s3.trim()+"how are you");

        //To lower case method

        String s1lower = "HELLO HOW Are You?";

        System.out.println(s1lower.toLowerCase());

        //To upper case method

        String s1Upper="hello how are you";
        //String s1upper=s1.toUpperCase();
        System.out.println(s1Upper.toUpperCase());

        //Concat method

        //------By using concat method----
        String strOne = "Learn ";
        String strTwo = "Java";
        // concatenate strOne and strTwo
        System.out.println(strOne.concat(strTwo)); // "Learn Java"

        // concatenate strTwo and strOne
        System.out.println(strTwo.concat(strOne)); // "JavaLearn "
        //--- By using + operator---
        String s4 =  "hello";
        String s5 = "Learners";
        //  String s6 = s4.concat(s5); or
        String s6 = s4 + s5;
        //both of the above statement will give you the same result

        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";

        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter 2

        // String Supplement is concatenated with character B
        String s7 = "Supplement" + 'B'; // s7 becomes SupplementB

        //Split method

        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));

        //charAt method

        String Message = "Welcome to Java";
        System.out.println("The first character in the message is " + Message.charAt(0));

        //compareTo method

        String S1="hello";
        String S2="hello";
        String S3="hemlo";
        String S4="flag";

        System.out.println(S1.compareTo(S2));
        System.out.println(S1.compareTo(S3)); //-1 because "l" is only one time lower than "m"
        System.out.println(S1.compareTo(S4)); // 2 because "h" is 2 times greater than "f"

        //Sub strings method

        String Str1 = "java is fun";

        // extract substring from index 0 to 3
        System.out.println(Str1.substring(0, 4));

        //IndexOf method

        String string1 = "Java is fun";
        int Result;

        // getting index of character 's'
        Result = string1.indexOf('s');

        System.out.println(Result); // 6

        // getting index of character 'J'
        Result = string1.lastIndexOf('J');
        System.out.println(Result); // 0

        // the last occurrence of 'a' is returned
        Result = string1.lastIndexOf('a');
        System.out.println(Result); // 3

        // character not in the string
        Result = string1.lastIndexOf('j');
        System.out.println(Result); // -1

        // getting the last occurrence of "ava"
        Result = string1.lastIndexOf("ava");
        System.out.println(Result); // 1

        // substring not in the string
        Result = string1.lastIndexOf("java");
        System.out.println(Result); // -1

        //contains method

        String STR1 = "Learn Java";

        Boolean result1;

        // check if str1 contains "Java"
        result1 = STR1.contains("Java");
        System.out.println(result1);  // true

        // check if str1 contains "Python"
        result1 = STR1.contains("Python");
        System.out.println(result1);  // false

        // check if str1 contains ""
        result1 = STR1.contains("");

        System.out.println(result1);  // true

        //replace method

        String str3 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str3.replace('a', 'z'));

        // all occurences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));
// all occurrences of "C++" is replaced with "Java"
        System.out.println(str3.replace("C++", "Java"));

        // all occurences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));

        //replace all method

        String str4 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str4.replaceAll(regex, " "));

        //equals method

        String s11="PerScholas";
        String s12="PerScholas";
        String s13=new String("PerScholas");
        String s14="Teksystem";
        System.out.println(s11.equals(s12));//true
        System.out.println(s11.equals(s13));//true
        System.out.println(s11.equals(s14));//false

        //using == operator

        String ss1="Perscholas";
        String ss2="Perscholas";
        String ss3=new String("Perscholas");
        System.out.println(ss1==ss2);//true (because both refer to same instance)
        System.out.println(ss1==ss3);//false(because s3 refers to instance created in nonpool)

        //compare to method

        String s_1="Perscholas";
        String s_2="Perscholas";
        String s_3="Perschola";
        String s_4="PerscholasX";
        System.out.println(s_1.compareTo(s_2)); //0
        System.out.println(s_1.compareTo(s_3)); // 1(because s1>s3)
        System.out.println(s_1.compareTo(s_4)); // -1(because s1<s4 )













    }
}
