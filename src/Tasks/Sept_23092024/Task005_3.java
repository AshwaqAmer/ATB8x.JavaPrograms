package Tasks.Sept_23092024;

public class Task005_3 {
    public static void main(String[] args) {
        /*
        Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
        Input. -
        choice - 1 - km → m, km → 1km
        choice - 2 - f → c, f → c
         */
        double KM = 100;
        double Fahrenheit = 20;
        double miles;
        double Celsius;
        String choice = "F->C";
        switch (choice){
            case "KM->M":
                miles= KM * 0.621371;
                System.out.println(" kilometers to miles is equal to " + miles +"miles");
                break;
            case "F->C":
                Celsius = ((Fahrenheit - 32) * 5/9);
                System.out.println(" Fahrenheit to Celsius is equal to " + Celsius+"°C");
            break;
            default:
                System.out.println("provide valid input");
        }
    }
}
