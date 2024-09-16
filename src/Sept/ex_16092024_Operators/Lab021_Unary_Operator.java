package Sept.ex_16092024_Operators;

public class Lab021_Unary_Operator {
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
    // 3. Increment(++) -> It is used to increment the value of an integer. It can be used in two separate ways:
    // a) post-increment
        int num = 10;
        int e = num++;
        System.out.println(+e);




    }

}
