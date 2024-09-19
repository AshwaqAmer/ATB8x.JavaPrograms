package Sept.ex_18092024_Operators;

public class Lab030 {
    public static void main(String[] args) {
//        int a = 10;
//        System.out.println(  --a); //+ a --  + a--);
//        // line no |  a  |  Exp 1|
//        //  7      |  10 |  9    |
//        // line no |  a  |  Exp 2|
//        //  7      |  8  |  9    |
//        // line no |  a  |  Exp 3|
//        //  7      |  7  |  8    |
//        // 9+9+8 =26
//        System.out.println(a); // current a value is 7
//        int a = 10;
//        System.out.println( --a + a++ + a--);
//        // line no |  a  |  Exp 1|
//        //  2      |  9  |  9    |
//        // line no |  a  |  Exp 2|
//        //  2      |  10 |  9    |
//        // line no |  a  |  Exp 3|
//        //  2      |  9  |  10    |
//        // 9+9+10 =28
//
//        System.out.println(a);
        int a = 10;
        System.out.println(  a--+ a--  + a--);
        // line no |  a  |  Exp 1|
        //  2      |  9  |  10    |
        // line no |  a  |  Exp 2|
        //  2      |  8  |  9    |
        // line no |  a  |  Exp 3|
        //  2      |  7  |  8    |
        // 10+9+8 =27


        System.out.println(a);
    }
}
