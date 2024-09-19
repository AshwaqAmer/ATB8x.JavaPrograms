package Sept.ex_18092024_Operators;

public class Lab030_INC_DEC_Ex {
    public static void main(String[] args) {
        int a1 = 10;
        int result1 = ++a1;
        System.out.println(a1);
        System.out.println(result1);

        // Line No. | Exp  |  a1
        //  5       |      |  10
        //  6       |  result = 11   |  11
        //  7       |  result = 11   |  11

        int a2 = 10;
        int result2 = a2++;
        System.out.println(a2);
        System.out.println(result2);

        // Line No. | Exp  |  a2
        //  5       |      |  10
        //  6       |  result = 10   |  11
        //  7       |  result = 10   |  11

        int a3 = 10;
        System.out.println(a3++ + a3);
        //  A = a++
        // +
        // B = a
        // Line No. |  a3 |  Exp
        //  5 | 10 | NA
        // 6    10

        int a4 = 10;
        System.out.println(a4++ + ++a4);
        System.out.println(a4);
        // A -> a4++ -> 10 , a4= 11
        // + -> operator
        // B -> ++a4  -> a4= 12 exp -> 12

        // Line no | a4  |  Exp
        // 5   | 10 | NA
        // 6  | 12 | 10 + 12

        int a5 = 10;
        System.out.println(++a5 + ++a5);
        System.out.println(a5);

        // A  -> ++a5 ->  Exp1 -> 11 , a5 = 11
        //  +
        // B- > ++a5  ->  a5 = 12 , Exp2 = 12
        // 23 , 12

        int a6 = 10;
        System.out.println(++a6 + a6++ + a6++);
        System.out.println(a6);
        //  Part ->  A -> ++a6 , Exp1 = 11 , a6 = 11
        //  Part ->  B -> a6++ , Exp2 = 11 , a6 = 12
        //  Part ->  C -> a6++, Exp3 = 12 , a6 = 13

        int a7 = 10;
//      int result3 = a7--;
        int result3 = --a7;
        System.out.println(a7);
        System.out.println(result3);


    }
}
