package src.Practice;

public class ReverseString {

    public static void main(String[] args) {

        String s = "Poonam";
        char[] ch = s.toCharArray();
        String news =" ";



        for (int i = ch.length-1; i < ch.length && i>= 0 ;i--){
           news += ch[i];
        }
        System.out.println(news);

    }
}
