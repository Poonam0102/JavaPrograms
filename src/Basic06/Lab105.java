package src.Basic06;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[4];
        System.out.println("enter first sub marks");
        marks[0] = sc.nextFloat();
        System.out.println("enter second sub marks");
        marks[1] = sc.nextFloat();
        System.out.println("enter third sub marks");
        marks[2] = sc.nextFloat();
        System.out.println("enter fourth sub marks");
        marks[3] = sc.nextFloat();

        for (int i =0;i<marks.length;i++){
            if (marks[i] < 30){
                System.out.println("You are Fail:"+marks[i]);
            }
            System.out.println(marks[i]);
            }
        sc.close();
        }

    }

