package src.oops_part1.Basic;

public class StringLab131 {
    public static void main(String[] args) {

        String name = "Poonam";
        System.out.println(name.concat(" Sangle"));
        System.out.println(name + " Sangle");
        System.out.println(name.contains("a"));
        System.out.println(name);


        String name2 = new String("Dutta");


        String expected_result = "password@123";
        String actual_result  = "Password@123";
        if(expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("Yes");
        }

    }
}

