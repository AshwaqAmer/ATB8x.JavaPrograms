package Oct.ex_04102024_Constructors;

public class Lab080_AHuman {
    public static void main(String[] args) {
        AHuman ashwaq = new AHuman();
        AHuman amer = new AHuman("amer");
        System.out.println(ashwaq.planet);
        System.out.println(amer.planet);

        System.out.println(ashwaq.aadhar_card_number);
        System.out.println(amer.name);
    }
}
