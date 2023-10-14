import java.util.Scanner;

public class assi13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer a = ");
        int a = sc.nextInt();
        int sum = 0;

        if(a%2 == 0) {
            for(int i = 0; i <= a; i+=2) {
                sum += i;
            }
            System.out.println("The result is " + sum);
        } else {
            System.out.println("I don't count the sum of odd number, bye bye");
        }      
    }
}

