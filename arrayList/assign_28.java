import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class assign_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of the list: ");
        int n = sc.nextInt();

        Random rd = new Random();
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0; i<n ; i++) {
            int randomNum = rd.nextInt(1,101);
            lst.add(randomNum); 
        }

        System.out.println(lst);
    }
}
