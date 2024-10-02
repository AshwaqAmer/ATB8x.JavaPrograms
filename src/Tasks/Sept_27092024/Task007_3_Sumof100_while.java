package Tasks.Sept_27092024;

public class Task007_3_Sumof100_while {
    public static void main (String args[]){
        int i=1;
        int result =0;
        while(i<=100){
            result = result + i;
            i++;
        }
        System.out.println("Sum of 1 to 100 is " +result);
    }
}
