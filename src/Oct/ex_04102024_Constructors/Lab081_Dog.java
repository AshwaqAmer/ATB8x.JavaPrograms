package Oct.ex_04102024_Constructors;

public class Lab081_Dog {
    public static void main(String[] args) {
        Dog german= new Dog();
        Dog peter = new Dog("Tommy");
        System.out.println(peter.name);
        System.out.println(peter.legs);// has this was not declared in the constructor default value printed as null


        Dog spider = new Dog("Spidyy", 4, 343, "Robert");
        System.out.println(spider.name);
        System.out.println(spider.legs);
        System.out.println(spider.tag);
        System.out.println(spider.owner_name);


    }
}
