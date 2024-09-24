package Sept.ex_20092024_Ternary_Conditions_loops;

import java.lang.Math;

import static java.lang.Math.max;

public class Lab033_Class_Excercise {
    public static void main(String[] args) {
        String str= 10>20?"10":"Twenty";
        System.out.println(str);

        int S1 = 50;
        int S2 = 70;
        String max = S1>S2? "50" : "70";
        String min = S1<S2? "50" : "70";
        System.out.println(max);
        System.out.println(min);

        System.out.println(Math.max(S1,S2));
        System.out.println(Math.abs(S1));
        System.out.println(Math.min(S1,S2));
        System.out.println(Math.sin(0));
    }
}
