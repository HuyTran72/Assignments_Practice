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


        int[] arr8 = {8,9,12,48,1,2,1,3};
        Arrays.sort(arr8);
        System.out.println("Mang sau sap xep:" + Arrays.toString(arr8));

        int[] arr9 = {8,9,12,48,1,2,1,3};
        for(int i=0, j = arr9.length-1; i<j; i++,j--) {
            int temp = arr9[i];
            arr9[i] = arr9[j];
            arr9[j] = temp;

        }
        System.out.println("The reverse of arr is: " + Arrays.toString(arr9));
        

        int[] arr10 = {8,9,12,48,1,2,1,3};
        int[] arr11 = arr10;
        arr10[0] = 101;
        System.out.println(Arrays.toString(arr10));


        //clone
        int[] arr12 = {8,9,12,48,1,2,1,3};
        int[] arr13 = arr12.clone();
        arr12[0] = 99;



    }
}
