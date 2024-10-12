package Oct.ex_04102024_Constructors;

public class Dog {
    String name;
    int legs;
    int tag;
    String owner_name;

    Dog()
    {
        System.out.println("Im DC");
    }

    Dog (String name){
        this.name =name;
    }

    Dog (String name, int legs, int tag, String owner_name){
        this.name=name;
        this.legs=legs;
        this.tag=tag;
        this.owner_name=owner_name;
    }

    void walk(){

    }
     void bark(){

     }
}
