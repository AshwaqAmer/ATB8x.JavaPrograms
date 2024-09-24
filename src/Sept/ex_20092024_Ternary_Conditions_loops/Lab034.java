package Sept.ex_20092024_Ternary_Conditions_loops;

public class Lab034 {
    public static void main(String[] args) {
        /*
        1) if-> if a certain condition is true then a block of statements is executed otherwise not.
                if(condition)
                {
                    // Statements to execute if
                    // condition is true
                    }
         */
        int a=10;
        int b=20;
        if(a<b) // here 10 < 20 condition is true so it will execute the below statement
            System.out.println("a is less than b");
        if (a>b) // here 10 > 20 condition is false so it will nor execute the below statement
            System.out.println("not executed");
        /*
        if-else-> when the condition is false then else statement will be executed.
            if (condition)
            {
                // Executes this block if
                // condition is true
            }
            else
            {
                // Executes this block if
                // condition is false
            }
         */
        if (a>b) {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("a is less than b");
        }

        if (a<b) {
            System.out.println("a is less than b");
        }
        else {
            System.out.println("a is greater than b");
        }

    }
}
