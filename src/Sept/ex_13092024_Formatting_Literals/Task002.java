package Sept.ex_13092024_Formatting_Literals;
/*
Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
double a = 34;
double b = 10;
Print - a+b, a-b, ab, a/b, a%b all the outputs.
 */
public class Task002 {
    public static void main(String[] args) {
        double a = 34;
        double b = 10;
        double Sum = a + b;
        double Sub = a - b;
        double Mul = a * b;
        double Div = a / b;
        double Pct = a % b;
        System.out.println("Small Calculator");
        System.out.println("------------------------------");
        System.out.println("Addition of a+b = " + Sum);
        System.out.println("Subtraction of a-b = " + Sub);
        System.out.println("Multiplication of ab = " + Mul);
        System.out.println("Division of a/b = " + Div);
        System.out.println("Percent of a%b = " + Pct);
    }
}
