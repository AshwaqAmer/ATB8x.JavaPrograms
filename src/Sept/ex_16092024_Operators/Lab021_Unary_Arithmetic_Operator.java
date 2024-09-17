package Sept.ex_16092024_Operators;

public class Lab021_Unary_Arithmetic_Operator {
    public static void main(String[] args) {
    // 1. Unary minus(-)-> This operator can be used to convert a positive value to a negative one.
        int     a = -20;
        double  b= -255.12;
        System.out.println(a);
        System.out.println(b);
    // 2. ‘NOT’ Operator(!) -> This is used to convert true to false or vice versa.
    // Basically, it reverses the logical state of an operand.
        boolean c = true;
        c = !c;
        System.out.println(c);
        System.out.println(!(a>b));

    // 5) Bitwise Compelement -> This unary operator returns the one’s complement representation of the
    // input value or operand, i.e, with all bits inverted, which means it makes every 0 to 1, and every 1 to 0.
    /*  a = 5 [0101 in Binary]
        result = ~5
        This performs a bitwise complement of 5
        ~0101 = 1010 = 10 (in decimal)
        Then the compiler will give 2’s complement
        of that number.
        2’s complement of 10 will be -6.
        result = -6
    */
        int result = 10;
        result = ~(result);
        System.out.println(result);
    }

}
