package Tasks.Sept_20092024;
import java.util.Scanner;

public class Task004_3 {
    public static void main(String[] args) {
// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Slide1 :");
        double side1 = sc.nextDouble();
        System.out.println("Enter the Slide2 :");
        double side2 = sc.nextDouble();
        System.out.println("Enter the Slide3 :");
        double side3 = sc.nextDouble();
        if (side1>1 && side2>1 && side3>1){
            if (side1 == side2 && side2 == side3 && side3 == side1){
                System.out.println("It's an Equilateral Triangle");
            }
            else if(side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("It's an Isosceles Triangle");
            }
            else {
                System.out.println("It's a scalene");
            }

        }
        else {
            System.out.println("Please provide a valid input");
        }
    }
}
