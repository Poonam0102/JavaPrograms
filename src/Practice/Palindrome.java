package src.Practice;

import java.util.Scanner;

public class Palindrome {

public static boolean ispalindrome(String userinput){
    String original_str = userinput;
    StringBuilder sb = new StringBuilder(userinput);
    String reverse_str = sb.reverse().toString();
   return original_str.equalsIgnoreCase(reverse_str);
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String userinput =sc.next();
        boolean result = ispalindrome(userinput);

        if (result){
            System.out.println("is Palindrom");
        }else {
            System.out.println("not a palindrom");
        }
    }
}
