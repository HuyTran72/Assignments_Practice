import java.util.Scanner;

public class assign_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an string text: ");
        String input = sc.nextLine();

        StringBuilder words = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder other = new StringBuilder();

        //loop words
        for (int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            if(Character.isDigit(c)) {
                number.append(c);
            } else if (Character.isLetter(c)) {
                words.append(c);
            } else {
                other.append(c);
            }
        }

        System.out.println(words);
        System.out.println(number);
        System.out.println(other);
    }
}
