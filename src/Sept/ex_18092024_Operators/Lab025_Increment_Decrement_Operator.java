package Sept.ex_18092024_Operators;

public class Lab025_Increment_Decrement_Operator {
    public static void main(String[] args) {
    // 1. Increment(++) -> It is used to increment the value of an integer. It can be used in two separate ways:
    // a) post-increment -> It will increment the value after execution of the statements
        int num = 10;
        int result = +num;// Unary plus assigns the result value same as num ie; 10

        result = num++ + 1;
        System.out.println("post-increment");
        System.out.println("num is : " +num + ", result is : " +result); // here num is 11 & result is 11

    // b) pre-increment -> It will increment the value before execution of the statements
    // current value of num is 11 & result is 11
        result = ++num + 1;
        System.out.println("Pre-increment");
        System.out.println("num is : " +num + ", result is: " +result); // here num is 12 & result is 13

    // 4. Decrement(++) -> It is used to decrement the value of an integer. It can be used in two separate ways:
    // a) post-decrement -> It will decrement the value after execution of the statements
        // current value of num is 12 & result is 13
        result= num-- + 1;
        System.out.println("post-decrement");
        System.out.println("num is : " +num + ", result is: " +result); // here num is 11 & result is 13

        // b) pre-decrement -> It will decrement the value before execution of the statements
        // current value of num is 11 & result is 13
        result = --num + 1;
        System.out.println("pre-decrement");
        System.out.println("num is : " +num + ", result is: " +result); // here num is 10 & result is 11
    }
}
