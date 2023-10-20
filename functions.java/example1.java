public class example1 {
    public static void main(String[] args) {
        String result1 = Solvept2(1, 2, 3);
        String result2 = Solvept2(1, 2, 1);
        String result3 = Solvept2(1, 2, -3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static String Solvept2(double a, double b, double c) {
        if (a == 0) {
            if(b == 0 && c == 0) {
                return("Infinity Solution");
            } else if (b == 0 && c != 0) {
                return("No solution");
            } else {
                return("Only 1 solution x = " + (-c/b));
            }
        } else {
            double delta = (b*b)-(4*a*c);
            if (delta <0) {
                return ("No solution");
            } else if (delta == 0) {
                double x = -b/ (2*a);
                return ("Only 1 solution x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta))/ (2*a);
                double x2 = (-b - Math.sqrt(delta))/ (2*a);
                return ("Has 2 solutions x1 = " + x1 + " x2 = " + x2);
            }
        }
    }
}
