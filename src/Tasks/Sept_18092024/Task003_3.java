package Tasks.Sept_18092024;

public class Task003_3 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println( --a + a++ + a--);
        // line no |  a  |  Exp 1|
        //  2      |  9  |  9    |
        // line no |  a  |  Exp 2|
        //  2      |  10 |  9    |
        // line no |  a  |  Exp 3|
        //  2      |  9  |  10    |
        // 9+9+10 =28

        System.out.println(a);
    }
}
