package Oct.ex_02102024;

public class Lab079 {
    public static void main(String args[]) {
        // Object Class - OOps
        // String Class - Ref
        // Arrays
        // for each
        // 2d nested for loop

        // Class -> Blueprint to create something
        // Objects - Instance of the class - created from the class.

        ATBStudent Ashwaq = new ATBStudent();
        Ashwaq.name = "Ashwaq Amer Mohammed";
        Ashwaq.age = 65;
        Ashwaq.address = "Hyderabad";
        Ashwaq.email = "mdashwaqamer@gmail.com";
        Ashwaq.phone = 1234456789;
        Ashwaq.isMale = true;
        Ashwaq.batch = 8;
        Ashwaq.githublink = "https://github.com/AshwaqAmer/ATB8x.JavaPrograms";
        Ashwaq.isfeedPaid = true;

        System.out.println(" Student Name: "        + Ashwaq.name);
        System.out.println(" Student Age: "         + Ashwaq.age);
        System.out.println(" Student Address: "     + Ashwaq.address);
        System.out.println(" Student Email: "       + Ashwaq.email);
        System.out.println(" Student Phone: "       + Ashwaq.phone);
        System.out.println(" Student Male: "        + Ashwaq.isMale);
        System.out.println(" Student batch: "       + Ashwaq.batch);
        System.out.println(" Student GitHubLink: "  + Ashwaq.githublink);
        System.out.println(" Is fee Paid: "         + Ashwaq.isfeedPaid);

    }
}
