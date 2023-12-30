package src.Practice;

public class array_Findsmallnumber {

//    Find Smallest number from array

    public static void main(String[] args) {
       int arr[] =new int[]{2,3,4,1,44};
       int min = arr[0];
       for(int i = 0;i<arr.length;i++){
           if (arr[i]<min)
               min =arr[i];

       }
        System.out.println("smallest number:" + min);
    }

    
}
