import java.util.Scanner;

public class assign14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer n = ");
        int n = sc.nextInt();
        int sum = 0;

        if (n%2 == 1){
            for(int i = 1; i <= n; i++) {
                if (n==3)
                    continue;
                else {
                sum += i;
                }
            System.out.println("The result is " + sum);
            }
        } else
            return;
    }
}
