package Tasks.Oct_04102024;

public class Person {
    /*Create a Person Class with 10 A, 5 Behaviors (All types of Methods) and use the DC and PC to set the values,
     Create 5 Objects.
     */
    String name;
    String gender;
    int age;
    String address;
    long phone_num;
    String email;
    long aadhar_num;
    boolean healthy;
    String profession;
    String Employer;

    // Default Constructor
    Person() {
        System.out.println("Default Constructor");
        this.phone_num = phone_num;
        this.aadhar_num = aadhar_num;
    }

    //Parameterized Constructor
    Person(String name, String gender, int age, String address, String email)
    {
        System.out.println("Parameterized Constructor Details");
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.phone_num = phone_num;
        this.email=email;
        this.aadhar_num=aadhar_num;
    }

    Person(String profession, String Employer)
    {
        System.out.println("PC");
        this.profession=profession;
        this.Employer=Employer;
    }

    public static void basicdetails() {
        System.out.println("Name: " );


    }

    public static String eat() {
        System.out.println("I will always eat healthy food");
        return "healthy";
    }

    public static void read(String secret) {
        System.out.println("love to read" + secret + "book");
    }

    public static int sleep(int hours) {
        System.out.println("I'm sleeping 8 hours daily");
        return 8;
    }
}

