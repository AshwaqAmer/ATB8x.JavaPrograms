package Tasks.Sept_20092024;

import java.util.Scanner;

public class Task004_4 {
    public static void main(String[] args) {
//Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
// Logic Building
// Step 1 -
// Input -> int -n -> n = 100
// Output -> String ->  Fizz, buzz and FizBuzz - SOP
// Step 2  :
// Rough Logic
// for ->  int = 1 to i <=100 (n)
//  i ->  multiple of 3 ->  modules -  i%3 == 0 -> Fizz
//  i ->  multiple of 5 ->  modules -  i%5 == 0 -> Buzz
//  i ->  multiple of 3,5 ->  modules -  i%5 && i%3 == 0 -> FizzBuzz
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            } else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            } else
            {
                System.out.println(i);
            }
        }
    }
}