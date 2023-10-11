import java.util.Scanner;

public class ifelse4 {
    public static void main(String[] args) {
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Input a month (number): ");
        int month = sc4.nextInt();

        if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) 
                || (month == 10) || (month == 12)) {
                    System.out.println("Month " + month + " has 31 days");
                }
        else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
                    System.out.println("Month " + month + " has 30 days");
        }
        else if ((month == 2)) {
            System.out.print("You need to input the year: ");
            int year = sc4.nextInt();
            if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) {
                System.out.println("Month " + month + " has 29 days");
            } else {
                System.out.println("Month " + month + " has 28 days");
            }
        }
    }
}
