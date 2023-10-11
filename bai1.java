import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer n: ");
        int n = sc.nextInt();

        String anwser = (n%2 == 0)? "even" : "odd";
        System.out.println("The number " + n + " is " + anwser);
    }
}
