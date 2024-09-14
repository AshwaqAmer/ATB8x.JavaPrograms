package Sept.ex_13092024_Formatting_Literals;

public class Lab017 {
    public static void main(String[] args) {
        // Problem statement - print the table of 2
        // Formatting
        // %d - any integer,byte, short, long
        // %s - String
        // %c - char
        // %f -> float, double

        //%d
        int num = 10;
        //System.out.printf("Value of %d",num);
        //System.out.println("2x1=2");
        System.out.printf("%d * %d = %d",num,1,num*1);
        System.out.println();
        System.out.printf("%d * %d = %d",num,2,num*2);

        //%s
        String a1 = "Ashwaq";
        String a2 = "is a working in TCS as Automation Tester";
        System.out.println();
        System.out.printf("%s %s", a1, a2);

        //%c
        char a3 = 'A';
        char a4 = 'B';
        char a5 ='C';
        String b1 ="are ";
        int count = 3;
        System.out.println();
        System.out.printf("%c%c%c %s %d", a3, a4, a5, b1, count);

        //%f
        double A1= 7124.24556;
        float f3= 3.14F;
        System.out.println();
        System.out.printf("%f", A1);
        System.out.println();
        System.out.printf("%f", f3);

    }
}
