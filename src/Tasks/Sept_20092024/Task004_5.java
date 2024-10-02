package Tasks.Sept_20092024;

import java.util.Scanner;

public class Task004_5 {
    public static void main (String args[]){
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println(" leap year");
        else
            System.out.println("Not a leap year");
    }
}
