package src.Basic06;

public class Lab099 {
    public static void main(String[] args) {
        int [] marks_10 ={98,56,78,89,36};
        System.out.println(marks_10.length);
        System.out.println(marks_10[0]);
        System.out.println(marks_10[1]);
        System.out.println(marks_10[2]);
        System.out.println(marks_10[3]);
        System.out.println(marks_10[4]);
//        System.out.println(marks_10[5]);

        int[] a =new int[4];
//        4 is the length
//        a =[0,0,0,0];
        a[0] =67;
        System.out.println(a[0]);

        final int[] b= new int [4];
//        b =[0,0,0,0];
        b[0] =67;
        System.out.println(b[0]);
    }
}
