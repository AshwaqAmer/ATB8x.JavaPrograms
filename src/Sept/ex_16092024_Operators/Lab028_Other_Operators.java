package Sept.ex_16092024_Operators;

public class Lab028_Other_Operators {
    public static void main(String[] args) {
    /*
    g) new Operator
    h) instanceof Operator
    i) Conditional or Ternary Operator
    j) Bitwise Operators. -> used in digital electronics not needed for automation
    */
    /*
     g) new Operator-> It is used to create the new object for class.
     It returns of the address of newly created object.
     ex: String s1 = new String(“Pramod”);
     */
        String s1 = new String("Ashwaq");
    // h) instanceOf Operator
        System.out.println(s1 instanceof String);
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
