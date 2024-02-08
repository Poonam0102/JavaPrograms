package src.Daily_Practice.Feb7_24;

public class Paracon {

    int id;
    String name;

//    create parameterized constructor
      Paracon(int i, String n){
       id = i;
       name =n;
      }
//      create method
    public void display(){
        System.out.println(id+" "+ name);
    }
    public static void main(String[] args) {
          Paracon s1 = new Paracon(1,"Poonam");
           s1.display();

    }
}
