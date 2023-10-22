package basis;
import java.util.Scanner;

public class assign14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer n = ");
        int n = sc.nextInt();
        int sum = 0;

        if(n%2 != 0) {
            for(int i = 1; i <= n; i+=2) {
                if (i==3) {
                    continue;
                } else 
                sum += i;
            }
            System.out.println("The result is " + sum);
        }
        
    }
}
