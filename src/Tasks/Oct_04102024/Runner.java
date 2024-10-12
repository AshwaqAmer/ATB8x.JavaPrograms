package Tasks.Oct_04102024;

public class Runner {
    public static void main(String[] args) {
        Person P1= new Person();
        System.out.println("Contact Details of Person1");
        P1.phone_num=903224341;
        P1.aadhar_num=123457895;

        Person P2= new Person();
        System.out.println("Contact Details of Person2");
        P2.phone_num=11452852;
        P2.aadhar_num=424585;

        //String name, String gender, int age, String address, String email
        Person P1_Details = new Person("Ashwaq", "Male", 28, "123 new streeet", "Ashwaq@mail.com" );



    }
}
