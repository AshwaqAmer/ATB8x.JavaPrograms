package Tasks.Sept_25092024;

public class Task006_4_Vowel_Consonant_Count {
    public static void main(String[] args) {
        int v_count = 0, c_count = 0;
        String str = "pramod";
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
               str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                v_count++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                c_count++;
            }
        }
        System.out.println("Number of vowels: " + v_count);
        System.out.println("Number of consonants: " + c_count);
    }
}

