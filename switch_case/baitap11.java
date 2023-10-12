package switch_case;
import java.util.Scanner;

public class baitap11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an option by number (1-4): ");
        int a = sc.nextInt();

        switch(a) {
            case 1: 
                System.out.println("Find by name");
                break;
            case 2: 
                System.out.println("Find by author");
                break;
            case 3:
                System.out.println("Fin by producer");
                break;
            case 4:
                System.out.println("Find by title");
                break;
            default:
                System.out.println(a + " is invalid, please input a number (1 - 4)");
                break;
        }
    }
}
