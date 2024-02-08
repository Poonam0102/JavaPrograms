package src.Oops_6Jan_String;

public class Lab130String {
    public static void main(String[] args) {

        String name = "Poonam"; // String constant Pool
        String name2 = new String("Pramod"); // Heap area

        name = "Sangle";

        String str1 = "Hello";
        str1  = str1.concat("Poonam");
        System.out.println(str1);

        String s1 = "Poonam";
        String s2 = new String( "Poonam");
        System.out.println(s1==s2);
        String s3 = s1;
        System.out.println(s1==s3);
}
}
