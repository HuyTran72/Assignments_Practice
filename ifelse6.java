import java.util.Scanner;

public class ifelse6 {
    public static void main(String[] args) {
        System.out.print("Input a month (1-12): ");
        int month6 = new Scanner(System.in).nextInt();

        if((month6 == 1) || (month6 == 2) || (month6 == 3)) {
            System.out.println("The month " + month6 + " is in the first quarter");
        } else if((month6 == 4) || (month6 == 5) || (month6 == 6)) {
            System.out.println("The month " + month6 + " is in the second quarter");  
        } else if((month6 == 7) || (month6 == 8) || (month6 == 9)) {
            System.out.println("The month " + month6 + " is in the third quarter");  
        } else if((month6 == 10) || (month6 == 11) || (month6 == 12)) {
            System.out.println("The month " + month6 + " is in the fourth quarter");  
        } else {
            System.out.println("This month doesn't exist");
        }
    }
}
