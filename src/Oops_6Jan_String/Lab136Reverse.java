package src.Oops_6Jan_String;

public class Lab136Reverse {
    // If something is Thread Safe, we avoid!
    // StringBuffer vs StringBuilder
//    avoid buffer
    public static void main(String[] args) {
        StringBuilder rev = new StringBuilder("Poonam");
        rev.reverse();
        System.out.println(rev);
    }
}
