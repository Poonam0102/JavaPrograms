package src.Daily_Practice.Feb6_24;

public class minarray {


    public static void main(String[] args) {

        int arr[] = {4,12,34,56,2};
        int min = arr[0];
        for(int i =1; i<arr.length;i++){
          if(arr[i]<min)
              min =arr[i];
        }
        System.out.println(min);

    }
}
