package Tasks.Oct_02102024;

public class ATBStudent {

        String name = "Ashwaq Amer Mohammed";
        int Age = 28;
        long Mobile_num = 1234567878;
        String Address = "Hyderabad";
        String Enrolled_in = "Automation with Java 8x batch";

       public void display_name()
       {
           System.out.println("Name of a Student: " + name);
       }
       public void display_age()
       {
           System.out.println("Student Age: " + Age);
       }
       public void display_Mobnum()
       {
           System.out.println("Mobile Number: " + Mobile_num);
       }
       public void display_Address()
       {
           System.out.println("Address: " + Address);
       }
       public void display_enroll()
       {
           System.out.println("Enrolled in: " + Enrolled_in);
       }

       public static void main(String[] args) {
           ATBStudent name = new ATBStudent();
           name.display_name();

           ATBStudent age = new ATBStudent();
           age.display_age();

           ATBStudent Mobilenum = new ATBStudent();
           Mobilenum.display_Mobnum();

           ATBStudent Address = new ATBStudent();
           Address.display_Address();

           ATBStudent Enroll = new ATBStudent();
           Enroll.display_enroll();
       }
}

