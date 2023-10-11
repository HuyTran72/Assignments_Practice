import java.util.Scanner;

public class ifelse3 {
    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Please input the year: ");
        int year = sc3.nextInt();

        if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) {
            System.out.println(year + " is the leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
