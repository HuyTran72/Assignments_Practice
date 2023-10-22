package basis;
public class ex15_dowhile {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        do {
            sum += a;
            a++;
        } while (a<=5);
        System.out.println("sum = " + sum);
    }
}
