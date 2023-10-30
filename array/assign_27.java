import java.util.Arrays;
import java.util.Scanner;

public class assign_27 {
    public static void main(String[] args) {
        // Scan from keyboard an array, n elements
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of the elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Please input the elements");

        for(int i=0; i<n ; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(arr));

        // Reverse array
        for(int i = 0, j = n-1; i<j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
        }
        System.out.println("The reverse array is " + Arrays.toString(arr));

        //Sort elements increase
        Arrays.sort(arr);
        System.out.println("The sort of array: " + Arrays.toString(arr));

        //count sum
        int sum = 0;
        for(int i = 0; i<n; i++) {
            sum += arr[i];
        }
        System.out.println("The sum is: " + sum);

        //Check index of elements
        System.out.print("Input an integer number: ");
        int number = sc.nextInt();

        boolean check = false;
        String index = "";
        for(int i = 0; i < n; i++) {
            if(number==arr[i]) {
                check = true;
                index += (i + " ");
            }
        }

        if(check) {
            System.out.println(number + " exists in array with index is: " + index);
        } else {
            System.out.println(number + "does not exist in array");
        }
    }
}
