import java.util.Scanner;

public class ifelse5 {
    public static void main(String[] args) {
        System.out.print("Input a = ");
        double a = new Scanner(System.in).nextDouble();
        System.out.print("Input b = ");
        double b = new Scanner(System.in).nextDouble();
        System.out.print("Input c = ");
        double c = new Scanner(System.in).nextDouble();

        double delta = Math.pow(b,2) - 4*a*c;

        if (delta < 0) {
            System.out.println("The equation has no solution");
        } else if (delta == 0) {
            double x = -b/ 2*a;
            System.out.print("The equation has only 1 solution: x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta))/ 2*a;
            double x2 = (-b - Math.sqrt(delta))/ 2*a;
            System.out.println("The equation has 2 solutions: x1 = " + x1 + "," + "x2 = " + x2);
        }
    }
}
