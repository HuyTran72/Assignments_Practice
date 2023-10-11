import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The sum of x and y is: ");
        double sum = sc.nextDouble();
        System.out.print("The sub of x and y is: ");
        double sub = sc.nextDouble();

        double x = (sum + sub)/2;
        double y = sum - x;

        System.out.println("The value of x: " + x);
        System.out.println("The value of y: " + y);
    }
}