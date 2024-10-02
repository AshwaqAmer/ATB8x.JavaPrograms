package Sept.ex_25092024_For_Loop;

import java.util.Scanner;

public class Lab071_ScannerClass_Input {
    public static void main(String[] args) {
        // How to take a use input
        //
        Scanner sc = new Scanner(System.in); // New Object
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("Enter the String");

        String name = sc.nextLine();
        System.out.println(name);
}
}
