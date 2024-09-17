package Sept.ex_16092024_Operators;

public class Lab023_String_Concatenation_Operator {
    public static void main(String[] args) {
    /*
    String Concatenation Operator (+) :
    + operator can be used for two purposes:
    1) Arithmetic Addition
    2) String Concatenation

     */
        String first_name = "Ashwaq Amer";
        String last_name = "Mohammed";
        int a = 10;
        int b = 20;
        // Concatenation Operator  +
        // + -> int + int -> math
        // + -> String -> combine -> concat
        System.out.println(first_name + last_name); // Ashwaq AmerMohammed
        System.out.println(a + b + first_name + last_name);// 30Ashwaq AmerMohammed
        System.out.println(first_name + last_name+ a + b);// Ashwaq AmerMohammed1020
        System.out.println(first_name + last_name+ (a + b));// Ashwaq AmerMohammed30
    }

}
