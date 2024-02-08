package src.Daily_Practice.Feb7_24;

public class Withoutconstructor {
// to display the default value
    int id;
    String name;

//    method to disaply values of  id and name
    public void display(){
        System.out.println(id +" "+name);
    }
    public static void main(String[] args) {
//        object created
        Withoutconstructor s2 = new Withoutconstructor();
        Withoutconstructor s1 = new Withoutconstructor();
//      dispaly values of the object
      s1.display();
      s2.display();





    }

}
