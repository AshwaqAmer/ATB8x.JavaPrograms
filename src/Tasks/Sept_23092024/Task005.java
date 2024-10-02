package Tasks.Sept_23092024;

public class Task005 {
    public static void main(String[] args) {
        /*
        Create a simple calculator that performs addition, subtraction, multiplication, division, and
        modulus based on user input using switch statements.
        Inputs :   num 1, num 2, +
        Output :  num1+num2 → print information.
         */
        double a = 20;
        double b = 10;
        char operator = '-';
        switch (operator) {
            case '+':
                System.out.println("Addition of a & b is equal to " + (a + b));
                break;
            case '-':
                System.out.println("subtraction of a & b is equal to " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication of a & b is equal to " + (a * b));
                break;
            case '/':
                System.out.println("Division of a & b is equal to " + (a / b));
                break;
            case '%':
                System.out.println("sum of a & b is equal to " + (a % b));
                break;
            default:
                System.out.println("It is not a valid operator");
        }

        /*
        Write a program that takes an integer input (1-12) and prints the name of the corresponding
        month using a switch statement.
        Input  - 12
        Out - Dec.
         */
        int month = 12;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid input");
        }

        /*
        Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
        Input. -
        choice - 1 - km → m, km → 1km
        choice - 2 - f → c, f → c
         */
        double KM = 100;
        double Fahrenheit = 20;
        double miles;
        double Celsius;
        String choice = "F->C";
        switch (choice) {
            case "KM->M":
                miles = KM * 0.621371;
                System.out.println("kilometers to miles is equal to " + miles + "miles");
                break;
            case "F->C":
                Celsius = ((Fahrenheit - 32) * 5 / 9);
                System.out.println("Fahrenheit to Celsius is equal to " + Celsius + "°C");
                break;
            default:
                System.out.println("provide valid input");
        }
    }
}
