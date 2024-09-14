package Sept.ex_13092024_Formatting_Literals;

public class Lab019 {
    public static void main(String[] args) {
        /* Literal are the actual values assigned to a variables.
           It can be numeric and non-numeric.
           Types of Literals
           1) Boolean Literals - true, false
           2) Character Literals -
              A char type variable can hold following:
              a) Single character enclosed in single quotation marks
              b) Escape Sequence
              c) ASCII Value
              d) UNICODE Character
              e) Octal Character
           3) String Literals
           4) Integral Literals
           5) Floating Literals
           6) null Literal
         */
        // 1) Boolean Literals - true, false
        boolean object_found = true;
        boolean object_not_found = false;

        // 2) Character Literals -
        // a) Single character enclosed in single quotation marks
        char a1 = 'A';
        char c1 = 'C';

        // b) Escape Sequence

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Ashwaq"+ new_line +  "Amer"); // adds new line in between
        System.out.println("Ashwaq"+ '\n' +  "Amer");     // we can use the Escape chars
        System.out.println("Ashwaq"+ tab_line +  "Amer"); // adds TAB in between
        System.out.println("Ashwaqa"+ back_space + '\t' +  "Amer"); // Removes the last letter from word before it
        System.out.println("Ashwaq"+ car_r +  "Ashwaq Amer"); // Removes the word before it

        // c) ASCII Value
        char a2 ='\u0030'; // Unicode
        System.out.println(a2);

        // d) UNICODE Character
        char c5  = '\u1F60';
        System.out.println(c5);
        // e) Octal Character
        // 061 ->  49
        //061 = (0 × 8²) + (6 × 8¹) + (1 × 8⁰) = 49

        // 3) String Literals--> Should be in double co
        String First_Name  = "Ashwaq";
        String Middle_Name = "Amer";
        String Last_Name   = "Mohammed";

        // 4) Integral Literals
        // Literal - integer type - Decimal system.
        int age = 78;

        // Binary Literal
        int binary_num  = 0b1010; //->

        // Octal base? 8
        int octal = 0101; // 0101 = (0 × 8³) + (1 × 8²) + (0 × 8¹) + (1 × 8⁰) = 65

        // Hexadecimal Literals
        int hex = 0Xface; //base 16 color combination are in hex - #28a745

        // 5) Floating Literals
        float f = 129.8763e2F;
        double d1 = 129.8763e+2;
        double d2 = 12987.63e-2;
        System.out.println(f);
        System.out.println(d1);
        System.out.println(d2);

        // 6) null Literal
        // null - non primitive
        String s1 = null; // only String can be used
        //int age = null; can't be used for null as it an integer type
        // boolean s = null; can't be used for null as it a boolean type


    }
}


