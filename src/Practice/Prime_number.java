package src.Practice;

public class Prime_number {

       public static boolean number(int n){

           if(n<=1){
               return false;
           }
           for (int i=2; i <=n/2; i++){
               if(n%i == 0){
                   return false;

               }
           }
           return true;
       }


    public static void main(String[] args) {
       boolean result = number(5);
        System.out.println(result);
    }

}
