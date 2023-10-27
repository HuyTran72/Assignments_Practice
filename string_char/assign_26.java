import java.util.Scanner;

public class assign_26 {
    public static void main(String[] args) {
        String input = "     Ga LaI LAp     TRinH     ";
        System.out.println(standardized(input));
    }

    public static String standardized(String input) {
        input = input.trim();
        String[] words = input.split("\\s+"); 
        for(int i =0 ; i<words.length; i++) {
            words[i] = words[i].toLowerCase();
            String firstChar = words[i].substring(0, 1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        return String.join(" ", words);
    }
}
