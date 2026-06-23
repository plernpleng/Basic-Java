package javastrings;

public class JavaStings {

    public static void main(String[] args) {
        String str1 = "My name is : ";
        String str2 = "Kittiyaporn Nedtip";
        String str3 = str1 + str2;

        System.out.println(str3);

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());

        System.out.println(str3.charAt(0));
        System.out.println(str2.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.contains(str2));
        System.out.println(str1.indexOf("i"));

    }
}
