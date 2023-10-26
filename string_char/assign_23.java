import java.util.Scanner;

public class assign_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an string text: ");
        String input = sc.nextLine();
    }

    public static boolean substring(String input) {
        boolean hasLetter = false;
        for(char c: input.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
                System.out.println(c);
            }
        }

        return true;
        
    }
}
