package Sept.ex_23092024_Switch;

public class Lab037 {
    public static void main(String[] args) {
        /* Switch-> The switch statement in Java is a multi-way branch statement.
        In simple words, the Java switch statement executes one statement from multiple conditions.
        It is an alternative to an if-else-if ladder statement.
        - Switch is multi way branch statement.
        - Java switch statement executes one statement from multiple conditions.
        - Java switch expressions must be of **byte**, **short, int, long(with its Wrapper type), enums and String.**
        -  case/s values are not allowed. Pramod != pramod.
        - The value for a case must be constant or literal. **Variables are not allowed.**
        Syntax:
                switch(expression)
                {
                    case statement 1:
                    code
                    break;
                    case statement 2:
                    code
                    break;
                    default statement 1: (optional)
                    code
                    break; (optional)
                    }
         */
        // Switch Condition
        // Days - 1 to 7 ->  1 mon, 2 - tue, 7 - sun...
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea, what day its");
                break;
        }
        System.out.println("End of the loop");
    }

}
