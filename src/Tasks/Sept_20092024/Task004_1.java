package Tasks.Sept_20092024;

public class Task004_1 {
   /* ✅ By using Ternary Operators max between 3 numbers.
         Input int - a,b,c - a = 10, b = 20, c = 45
         Max → a,b,c → c
    */
    public static void main (String[] args){
        int a=10, b=20, c=45;
        int max_value = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The max value between three numbers is "+max_value);
    }
}

