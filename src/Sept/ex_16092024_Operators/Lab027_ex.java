package Sept.ex_16092024_Operators;

public class Lab027_ex {
    public static void main(String[] args) {
        // BIO
        int a = 12;
        boolean b = !(a > 10 || a < 5);
        // !(true); -> false
        //  BODMAS-> Bracket, Of, Division, Multiplication, Addition, and Subtraction.
        System.out.println(b);
    }
}