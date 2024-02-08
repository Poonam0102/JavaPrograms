package src.Oops_6Jan_String;

public class Lab131Methods {
    public static void main(String[] args) {

        String name = "Poonam";
        System.out.println(name.concat(" Sangle"));
        System.out.println(name + " Sangle");
        System.out.println(name.contains("i"));
        System.out.println(name);


        String name2 = new String("Sangle");


        String expected_result = "password@123";
        String actual_result  = "Password@123";
        if(expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("Yes");
        }

    }}
