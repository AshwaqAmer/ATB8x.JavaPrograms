package Oct.ex_09102024_Inheritance.single_Inheritance.real;

public class Lab084_real {
    public static void main(String[] args) {
        TestCase1 TC1 = new TestCase1();
        TC1.StartBrowser();
        TC1.readexcelfile();
        TC1.CloseBrowser();
        TestCase2 TC2 = new TestCase2();
        TC2.StartBrowser();
        TC2.readexcelfile();
        TC2.CloseBrowser();

    }
}
