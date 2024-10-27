package Oct.ex_09102024_Polymorphism.MethodOverLoading.real;

public class Lab088 {
    public static void main(String[] args) {
        Ashwaq A = new Ashwaq();
        A.home();

        Father F = new Father();
        F.home();

        Father F1 = new Ashwaq();
        F1.home();
    }
}
