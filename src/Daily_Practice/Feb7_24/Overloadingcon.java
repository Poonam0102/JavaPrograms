package src.Daily_Practice.Feb7_24;

public class Overloadingcon {
    int id;
    String name;
    int age;

    Overloadingcon(int i, String n){
        id= i;
        name = n;

    }
    Overloadingcon(int i ,String n, int a){
        id= i;
        name = n;
        age= a;

    }

//    Method
    public  void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        Overloadingcon s1 =new Overloadingcon(1,"Poonam");
        Overloadingcon s2 =new Overloadingcon(2,"toonam",22);
        s1.display();
        s2.display();

    }

}
