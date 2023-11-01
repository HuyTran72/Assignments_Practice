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
            int ranDom = rd.nextInt(101);
            list.add(ranDom);
        }
        System.out.println("The list is: " + list);

        int count = 0;
        String index = "";
        for(int i=0; i<n; i++) {
            if(list.get(i) < 80) {
                count++;
                index+= i+" ";
            }
        }
        System.out.println("The number of elements less than 80 is: " + count);
        System.out.println("The list of index of elements less than 80 is: " + index);
    }
}
