package Sept.ex_23092024_Switch;

public class Lab049 {
    public static void main(String[] args) {
        char c = 'C';
        switch (c) {
            case 'A' + 1:
                System.out.println("B");
                break;
            case 'A':
                System.out.println("A");
                break;
            case 'A' + 2:// converts to A ASCII value 65 + 2 = 67 ie; is C
                System.out.println("C");
                break;
        }
    }
}
