package Sept.ex_16092024_Operators;

public class Lab024_Assignment_Operators {
    public static void main(String[] args) {
    /*Assignment Operators-> These operators are used to assign values to a variable.
    The left side operand of the assignment operator is a variable, and the right side operand
    of the assignment operator is a value. The value on the right side must be of the same data
    type of the operand on the left side.
     */
    /* 1) Simple Assignment Operator:
    The Simple Assignment Operator is used with the “=” sign where the left side consists of the
    operand and the right side consists of a value. The value of the right side must be of the
    same data type that has been defined on the left side.
     */
        // Declaring variables
        int num;
        String name;
        // Assigning values
        num = 10;
        name = "INDIA";
        // Displaying the values
        System.out.println("Simple Assignment Operator");
        System.out.println("num is assigned : " + num);
        System.out.println("name is assigned: " + name);
    /*
    2) Compound Assignment Operator: The Compound Operator is used where +,-,*,and / is used along
         with the = operator.
    */
        int a = 2;
        double b = 4;
        int c = 6;
        double d = 8;
        // +=
        a += a; // a = a + 2;
        System.out.println("+= Operator");
        System.out.println(a);
        // -=
        b -= b; // b = b - 4;
        System.out.println("-= Operator");
        System.out.println(b);
        // *=
        c *= c; // c = c * 6;
        System.out.println("*= Operator");
        System.out.println(c);
        // /=
        d /= d; // d = d / 8;
        System.out.println("/= Operator");
        System.out.println(d);
    }
}
