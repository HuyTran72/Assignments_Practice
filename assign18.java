import java.util.Scanner;

public class assign18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer number a =  ");
        int a = sc.nextInt();

        while (a<=0) {
            System.out.println("Input a, a > 0");
            a = sc.nextInt();
        }

        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2)
            System.out.println(a + " is a prime number");
        else {
            System.out.println(a + " is not a prime number");
        } 
    }
}   
