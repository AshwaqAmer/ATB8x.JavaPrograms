package Tasks.Sept_20092024;

import java.util.Scanner;

public class Task004_2 {
    public static void main(String[] args) {
 /* → int score = 85
String grade →
 score >= 90 → A
 score >= 80 → B
 score >= 70 → C
   */
        int score;
        System.out.println("Enter score between 70 to 100");
        Scanner sc=new Scanner(System.in);
        score=sc.nextInt();
        String grade = score>=90?"A":(score>=80?"B":(score>=70?"C":"D"));
        System.out.println("Grade is "+ grade);
    }
}
