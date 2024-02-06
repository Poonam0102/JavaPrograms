package src.oops_part1.Basic;

public class ThreadSafeLab136 {

    public static void main(String[] args) {


        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Poonam");
        stringBuilder.reverse();
        System.out.println(stringBuilder);


    }
}
