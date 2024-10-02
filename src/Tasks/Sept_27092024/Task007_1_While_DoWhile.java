package Tasks.Sept_27092024;

import java.util.Scanner;

public class Task007_1_While_DoWhile {
    public static void main(String args[]) {
        /*
        Give me example of while vs do while loop in Lab ex
         */
        /*
        While-> It is an entry controlled loop. While loop will check the condition first
        then execute the block of statements(body)
        Syntax: Initialize | Condition | Execution | Update ( Inc or Dec)
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age1");
        int age1 = sc.nextInt();
        while (age1 < 13) {
            System.out.println("Polio Vaccination can be given at " + age1);
            age1++;
        }
    /*
    Do while -> In Do while the block of statement is executed first then condition will be verified.
    Syntax: /Initialize | Execute | Condition | Update (Inc or Dec);
     */
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the age2");
        int age2 = sc1.nextInt();
        sc.close();
        do {
            System.out.println("Polio Vaccination can be given at " + age2);
            age2++;
        } while (age2 < 13);

    }
}
