import java.util.Scanner;

public class assign_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an array: ");
        String input = sc.nextLine();

        String arr = new StringBuilder(input).reverse().toString();
        System.out.println("The reverse of the String is: " + arr);

        if(input.equalsIgnoreCase(arr)) {
            System.out.println("It is a Panlyndrome String");
        } else {
            System.out.println("It is not a Panlyndrome String");
        }     
    
        


    }
}
