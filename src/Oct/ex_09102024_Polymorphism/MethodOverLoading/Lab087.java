package Oct.ex_09102024_Polymorphism.MethodOverLoading;

public class Lab087 {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        int result = m.add(3,4);
        System.out.println(result);

        String name = m.add("Ashwaq", "Amer");
        System.out.println(name);

        double resultd = m.add(22.5, 22.5);
        System.out.println(resultd);
    }
}
