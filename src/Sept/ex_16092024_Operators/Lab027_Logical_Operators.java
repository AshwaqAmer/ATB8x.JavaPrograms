package Sept.ex_16092024_Operators;

public class Lab027_Logical_Operators {
    public static void main(String[] args) {
    /*
    Logical operators are used to perform logical “AND”, “OR” and “NOT” operations,
    i.e. the function similar to AND gate and OR gate in digital electronics.
    AND Operator ( && ) – if( a && b ) [if true execute else don’t]
    OR Operator ( || )  – if( a || b) [if one of them is true to execute else don’t]
    NOT Operator ( ! )  – !(a<b) [returns false if a is smaller than b]
    */
        // !, && , ||
        boolean a = true;
        boolean b = false;
        boolean c = true && true;
        boolean d = true && false;
        boolean e = false&& true;
        boolean f = false&& false;


        boolean g = true || true;
        boolean h = true || false;
        boolean i = false|| true;
        boolean j = false|| false;

        System.out.println("AND");
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        System.out.println("OR");
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);

        System.out.println("not Equal");
        System.out.println(!a);
        System.out.println(!b);
    }
}
