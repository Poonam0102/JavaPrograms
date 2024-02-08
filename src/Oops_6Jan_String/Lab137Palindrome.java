package src.Oops_6Jan_String;

import java.util.Scanner;

public class Lab137Palindrome {


    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string I will check palindrom for you");
        String user_input = sc.next();

        boolean result = ispalindrome(user_input);

        if (result){
            System.out.println("is PAlindrome");
        }else {
            System.out.println("not palindrome");
        }


    }

    private static boolean ispalindrome(String userInput) {
        String original_str = userInput;
         StringBuilder sb = new StringBuilder(userInput);
        String reverse_string = sb.reverse().toString();
        return original_str.equalsIgnoreCase(reverse_string);
    }


}
