import java.util.Scanner;

public class ass16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an value: ");
        int n = sc.nextInt();
        System.out.println("Choose the method to solve: \n 1.Solve by for\n 2.Solve by while ");
        System.out.print("Your choice is (1 or 2): ");
        int number = sc.nextInt();
        int fac = 1;

        switch(number) {
            case 1:
                for (int i = 1; i <= n; i++) {
                    fac *= i;
                }
                System.out.println("The result is " + fac);
                break;
            case 2:
                int a = 1;
                while (a <= n) {
                    fac *= a;
                    a++;
                }
                System.out.println("The result is " + fac);
                break;
        }
    }
}
