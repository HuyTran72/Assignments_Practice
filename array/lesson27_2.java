import java.util.Arrays;
import java.util.Scanner;

public class lesson27_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number of element of an array: ");
        int n = sc.nextInt();

        //creat array with n elements
        int[] arr = new int[n];

        //input data for each element
        for(int i=0; i< n; i++) {
            System.out.println("arr[" + i + "]= ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is: " + Arrays.toString(arr));
    }
}
