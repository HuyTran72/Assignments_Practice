import java.util.ArrayList;
import java.util.Scanner;

public class assign_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of elements n = ");
        int n = sc.nextInt();

        ArrayList<Integer> lst = new ArrayList<>();
        for(int i =0; i<n; i++) {
            System.out.print("Input the element " + (i+1) + ": ");
            int num = sc.nextInt();
            lst.add(num);
        }
        System.out.println("The list is: " + lst);

        System.out.println("----------");
        
        ArrayList<Integer> lstSquare = new ArrayList<>();
        System.out.print("Input number of elements n = ");
        n = sc.nextInt();
        for(int i = 0; i<n ; i++) {
            System.out.print("Input the element " + (i+1) + ": ");
            int numSq = sc.nextInt();
            lstSquare.add(numSq*numSq);
        }
        System.out.println("The list square of elements is: " + lstSquare);
    }
}
