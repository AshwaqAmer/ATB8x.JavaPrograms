package Tasks.Sept_16092024;

public class task003 {
    public static void main(String[] args) {
    /*
    1) Difference between = and  ==?
    = → It is an assignment operator which assigns the value to a variable.
    ex: int a = 10; float f1= 1.23F; double d1= 255;
    == → It is a relational operator which compares the values of two variables. if matches print
         the output as true or else false.
    */
        int a= 10;
        int b =10;
        System.out.println(a==b); //here the output will be true.
    /*
    2) byte b = 10; long l = 10l; → How much Byte will be used.
    byte b = 10;→ 1 byte
    long l = 10l; → 8 bytes
    */

    /*
    3)Another byte b = 10; byte c = 10;  What is the answer if to perform b+c, What is the data type it will give in result.
    byte b = 10;
    byte c = 10;
    → The data type for b & c are byte. So, the result type will be int as byte b =10; (1st operand)
      and byte c 10; (2nd operand).

    4) what will be the output
       short s = 10;
       char c = 'A'; //65
       int ss = s+c;
       System.out.println(ss);
    → During the execution of int ss =s+c; statement the JVM converts the char c ='A'; to ASCII value
      i.e; 65 so, the output will be printed as 75
    */
        short s = 10;
        char  c = 'A'; //65
        int  ss = s+c;
        System.out.println(ss);
    }
}
