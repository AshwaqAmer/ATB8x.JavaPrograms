package Tasks.Sept_23092024;

public class Task005_1 {
    public static void main(String[] args) {
        /*
        Create a simple calculator that performs addition, subtraction, multiplication, division, and
        modulus based on user input using switch statements.
        Inputs :   num 1, num 2, +
        Output :  num1+num2 → print information.
         */
        double a = 20;
        double b = 10;
        char operator ='&';
        switch (operator){
            case '+':
                System.out.println("Addition of a & b is equal to "+ (a+b));
                break;
            case '-':
                System.out.println("subtraction of a & b is equal to "+ (a-b));
                break;
            case '*':
                System.out.println("Multiplication of a & b is equal to "+ (a*b));
                break;
            case '/':
                System.out.println("Division of a & b is equal to "+ (a/b));
                break;
            case '%':
                System.out.println("sum of a & b is equal to "+ (a%b));
                break;
            default:
                System.out.println("It is not a valid operator");
        }

    }
}
