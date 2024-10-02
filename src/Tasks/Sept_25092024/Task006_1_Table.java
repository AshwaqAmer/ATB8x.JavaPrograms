package Tasks.Sept_25092024;

import java.util.Scanner;

public class Task006_1_Table {
    public static void main (String args[]){
        //Table of number n = 10, print table with For or while.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        sc.close();
        int i;
        int result1;
        int result2;
        System.out.println("Table of " + num + " using for loop");
        for (i=1; i<=10; i++){
            result1= num * i;
            System.out.println(+num + " " + "*" +" " + i + " " + "=" + " "+result1);
        }
        System.out.println("--------------------------------------");
        System.out.println("Table of " + num + " using while loop");
        int j=1;
        while (j<10) {
            j++;
            result2 = num * j;
            System.out.println(+num + " " + "*" + " " + j + " " + "=" + " " + result2);
        }
    }
}
