package src.Practice;

public class Primenumber_diffapproach {


    public static void main(String[] args) {
        int count =0;
        int n =5 ;
//        System.out.println("Enter number");
//        Scanner sc = new Scanner(System.in);
//        n = ref.nextInt();

        for(int i =1; i<=n;i++){
            if(n%i ==0){
                count++;
            }

        }
        if(count==2){
            System.out.println("Prime number");
        }else {
            System.out.println("not prime number");
        }
    }
}
