import java.util.Scanner;

public class assign19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a = ");
        double a = sc.nextDouble();
        System.out.print("Please input b = ");
        double b = sc.nextDouble();
        System.out.print("Please input the operation (+ or - or * or /) op: ");
        String op = sc.nextLine();
        double rel = Operation1(a, b, op);
        System.out.println(rel);
    }

    public static Double Operation1(double a, double b, String op) {
        double result = 0;
        try {
            if (op.equals("+")) {
            return a+b;
        } else if (op.equals("-")) {
            return a-b;
        }else if (op.equals("*")) {
            return a*b;
        } else if (op.equals("/")) {
            while (b == 0) {
                System.out.println("Please input b again, b is not equal to 0");
                System.out.println("Input b = ");
            }
            return a/b;
        }
        } catch (ArithmeticException e) {
            System.out.println("The denominator is not equal to 0");
            e.printStackTrace();
        }
        return result;
    }
}
