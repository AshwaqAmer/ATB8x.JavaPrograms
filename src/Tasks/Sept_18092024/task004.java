package Tasks.Sept_18092024;

public class task004 {
    public static void main(String[] args) {
        // Implicit Widening
        int num = 50;
        double num1 = num;
        System.out.println(num1); // Output-> 50.0

        // Explicit Widening
        long num2 = 123456789;
        double num3 = (double)num2;
        System.out.println(num3); // Output-> 1.23456789E8

        // Implicit Narrowing
        int salary = 45000;
        double Advance = 2456.938;
        //int total = salary - Advance;// Invalid

        // Explicit Narrowing
        int total = salary - (int)Advance;
        System.out.println(total); // it will omit the .938 so output-> 43544
    }
}
