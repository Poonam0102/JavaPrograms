package src.Oops_6Jan_String;

public class Lab132Interviewque {
    public static void main(String[] args) {
        String s1 = "Poonam";
        String s2 = new String( "Poonam");
        System.out.println(s1==s2); //false
        System.out.println(s1.equals(s2)); //true with equals contains is equal.
        String s3 = new String("poonam");
        System.out.println(s1==s3); // false beacuse of case sensitive
        System.out.println(s1.equalsIgnoreCase(s3)); //true
    }
    }

