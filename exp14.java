import java.util.Scanner;

public class exp14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer (1-99): ");
        int n = sc.nextInt();

        while (n<1 || n>99) {
            System.out.println("Invalid, input n (1-99)");
            n = sc.nextInt();
        }
        System.out.println("n = " + n);
    }
}
