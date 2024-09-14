package Sept.ex_13092024_FormattingandLiterals;

public class Lab017 {
    public static void main(String[] args) {
        // Problem statement - print the table of 2
        // Formatting
        // %d - any integer,byte, short, long
        // %s - String
        // %c - char
        // %f -> float, double
        int num = 10;
        String a1 = "Ashwaq";
        String a2 = "is a working in TCS as Automation Tester";
        //System.out.printf("Value of %d",num);
        //System.out.println("2x1=2");
        //%d
        System.out.printf("%d * %d = %d",num,1,num*1);
        System.out.println();
        System.out.printf("%d * %d = %d",num,2,num*2);
        //%s
        System.out.printf("%s"\n"%s", a1, a2);
    }
}
