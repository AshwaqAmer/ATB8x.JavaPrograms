package Sept.ex_25092024_For_Loop;

public class Lab067 {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) { // 0 to 9
            System.out.println(i);
            if(i == 5){
                continue; // when i ==5 then it will continue the block it not it will move to next statement
            }
            System.out.println("After");
        }
    }
}
