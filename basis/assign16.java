package basis;
public class assign16 {
    public static void main(String[] args) {
        int sum = 0;
        int fac = 1;

        for(int i = 1; i <= 10; i++) {
            fac *= i;
            sum += fac;
        }
        System.out.println(sum);

    }
}
