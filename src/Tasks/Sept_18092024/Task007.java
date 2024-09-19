package Tasks.Sept_18092024;

public class Task007 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(  a-- + a--  + a--);
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
