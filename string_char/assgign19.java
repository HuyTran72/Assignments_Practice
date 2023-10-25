import java.util.Scanner;

public class assgign19 {
    public static void main(String[] args) {
        System.out.print("Input an string: ");
        String str = new Scanner(System.in).nextLine();
        int count_Num = 0;
        int count_low = 0;
        int count_Upp = 0;
        int count_Spa = 0;

        System.out.println("The length of the string : " + str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(4);
            if(Character.isLowerCase(c)) {
                count_low++;
            } else if (Character.isUpperCase(c)) {
                count_Upp++;
            } else if (Character.isDigit(c)) {
                count_Num++;
            } else if (Character.isWhitespace(c)){
                count_Spa++;
            }
        }
        System.out.println("Number of lowercase = " + count_low);
        System.out.println("Number of uppercase = " + count_Upp);
        System.out.println("Number of num = " + count_Num);
        System.out.println("Number of Space = " + count_Spa);

    }
}
