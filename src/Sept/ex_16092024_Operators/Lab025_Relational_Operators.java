package Sept.ex_16092024_Operators;

public class Lab025_Relational_Operators {
    public static void main(String[] args) {
    /*
    Relational Operators are a bunch of binary operators used to check for relations between two operands,
    including equality, greater than, less than, etc. They return a boolean result after the comparison.
    ==, !=, >, <, >=, <=
     */
        int a =10;
        double b = 20;
        boolean c = a>b;
        System.out.println("Is is a==b: " +(a==b));
        System.out.println("Is is a!=b: " +(a!=b));
        System.out.println("Is is a>b: "  +(a>b));
        System.out.println("Is is a<b: "  +(a<b));
        System.out.println("Is is a>=b: " +(a>=b));
        System.out.println("Is is a<=b: " +(a<=b));
    }
}
