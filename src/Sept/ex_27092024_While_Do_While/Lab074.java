package Sept.ex_27092024_While_Do_While;

public class Lab074 {
    public static void main (String args[]){
        /*
        Do while-> In the case of do-while first block of statements will be executed and then condition
        will be verified.
        */
        //    While -> int -> condition -> body -> increment / decrement
        // Do while -> int -> body -> condition -> increment / decrement
        int i=0;
        do {
            System.out.println(i);
            i++;
        }while(i<0);
    }
}
