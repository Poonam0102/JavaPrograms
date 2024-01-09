package src.Daily_Practice.Jan9_24;

public class ReverseStringwith_Method {
        public static String reversechar(String name){
            char[] newarray = name.toCharArray();
            String result = "";
            for (int i = newarray.length-1; i<newarray.length && i>=0; i-- ){
                result += newarray[i];
            }

            return result;

        }

    public static void main(String[] args) {
           String output = reversechar("Poonam");
        System.out.println(output);


    }


}
