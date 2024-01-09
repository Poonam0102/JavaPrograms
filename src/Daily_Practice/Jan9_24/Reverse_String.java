package src.Daily_Practice.Jan9_24;

public class Reverse_String {


    public static void main(String[] args) {
        String name = "Poonam";
        char[] newarray = name.toCharArray();
        String reverseresult = "";
        for (int i = newarray.length-1; i<newarray.length && i >= 0;i--){
            reverseresult += newarray[i];

        }
        System.out.println("reverseresult ="+reverseresult);



    }
}
