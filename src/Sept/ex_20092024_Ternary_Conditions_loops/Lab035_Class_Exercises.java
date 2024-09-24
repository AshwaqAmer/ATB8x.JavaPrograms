package Sept.ex_20092024_Ternary_Conditions_loops;

public class Lab035_Class_Exercises {
    public static void main (String [] args) {
        int age = 12;
        if (age > 18) {
            System.out.println("Allowed to Vote!!");
        } else {
            System.out.println("Not Allowed!");
        }
        int a = 10;
        if( a == 4){
            System.out.println("Hahahah");
        }
        else{
            System.out.println("Bye");
        }
        boolean b = !true;
        if(b){
            System.out.println("b is true");
        }else {
            System.out.println("b is not true");
        }
        boolean c = true;
        c = !c;
        if (2 + 2 < 4) {
            System.out.println("Inside the loop");
        }
        System.out.println("Outside -> " + c);

        int num = 11;
        if ( num % 2== 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        int num1 = 30;
        int num2 = 30;
        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1) {
            System.out.println(num2);
        } else {
            System.out.println("Equal!");
        }
    }
}
