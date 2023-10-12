import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int a = sc.nextInt();

        int div = a%2;
        switch (div) {
            case 0: 
                System.out.println(a + " is an even");
                break;
            default:
                System.out.println(a + " is an odd");
                break;
        }
    }
}