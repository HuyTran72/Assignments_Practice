import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class assign_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of elements n = ");
        int n = sc.nextInt();

        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n ; i++) {
            int ranDom = rd.nextInt(n);
            list.add(ranDom);
        }
        System.out.println("The list is: " + list);

        int count = 0;
        ArrayList<Integer> listNew = new ArrayList<>();
        for(int x: list) {
            if(x < 80) {
                listNew.add(x);
                count++;
            }
        }
        System.out.println("The number of elements less than 80 is: " + count);
        System.out.println("The list of elements less than 80 is: " + listNew);

        
    }
}
