package Sept.ex_20092024_Ternary_Conditions_loops;

public class Lab032_Ternary_Operator {
    public static void main(String[] args) {
    /*
        i) Conditional or Ternary Operator-> the only conditional operator that takes three operands.
        It’s a one-liner replacement for the if-then-else statement and is used a lot in Java programming.
                We can use the ternary operator in place of if-else conditions or even switch conditions using nested
        ternary operators.
        Syntax: variable = Expression1 ? Expression2: Expression3
        if(Expression1)
        {
            variable = Expression2;
        }
        else
        {
            variable = Expression3;
        }
    */
        int a = 10;
        int b= 20;
        int max;
        // variable = Expression1 ? Expression2: Expression3
        max=  (a>b) ? a : b;
        System.out.println(max);
    }
}
