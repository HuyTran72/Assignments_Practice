import java.util.ArrayList;
import java.util.Scanner;

public class assign_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of elements n = ");
        int n = sc.nextInt();

        ArrayList<Integer> lst = new ArrayList<>(n);
        for(int i =0; i<n; i++) {
            System.out.println(lst.indexOf(i));
            int num = sc.nextInt();
        }
        System.out.println(lst);
    }
}
