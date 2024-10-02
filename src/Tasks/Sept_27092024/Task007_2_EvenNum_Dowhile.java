package Tasks.Sept_27092024;

public class Task007_2_EvenNum_Dowhile {
    public static void main (String args[]){
        /*
        Create a Java program that prints the first 5 even numbers using a do-while loop.
         */
        int i=1;
        do{
            if (i%2==0) {
                System.out.println(+ i + " is a even number");
            }
            i++;
        }while(i<5);
    }
}
