package Sept.ex_25092024_For_Loop;

public class Lab069 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }
        System.out.println(" -- ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            if (i == 'P') {
                System.out.println(i);
                break;
            }

        }
    }
}
