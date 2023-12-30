package src.Basic06;

public class Lab104 {
    public static void main(String[] args) {
        int[] int_array ={81,82,9,4,5};
        float[] f_array = {23.3f,23.6f,798.4f};
        double[]d_array ={23.4,55.4,3.45};
        boolean[] b_array = {true, false,true,true};
        char[] c_array = {'a','f','e'};
        String[] s_array ={"ddsa","adsd","asdaf"};

        System.out.println(int_array.length);
        for(int i = 0; i< int_array.length;i++){
            System.out.println(int_array[i]);
        }
    }
}
