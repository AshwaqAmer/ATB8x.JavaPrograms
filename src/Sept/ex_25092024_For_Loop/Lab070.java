package Sept.ex_25092024_For_Loop;

public class Lab070 {
    public static void main(String[] args) {
        // while - A, B, C
        //         // A - Init
        //        // B - Condition
        //        // C - Increment / Decrement

        int i = 0; // A
        while (i <= 10) {  // B
            System.out.println(i);
            i++; // C
        }

        for (int j = 0; j <= 10; j++) {
            System.out.println(j);
        }
    }
}