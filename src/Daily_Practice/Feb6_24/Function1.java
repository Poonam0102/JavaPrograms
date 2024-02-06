package src.Daily_Practice.Feb6_24;

import java.util.Scanner;

public class Function1 {
    //    Print a given name in a function
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name =sc.next();

        printMyName(name);


    }
}
