import java.util.Calendar;
import java.util.Scanner;

public class exam_2 {
    public static void main(String[] args) {
        int day, month, year, age;
        Scanner input = new Scanner(System.in);
        System.out.println("Input your day: ");
        day = input.nextInt();
        System.out.println("Input your month: ");
        month = input.nextInt();
        System.out.println("Input your year: ");
        year = input.nextInt();
        

        Calendar birthday = Calendar.getInstance();
        
        birthday.set(year, month-1, day);
        int year_born = birthday.get(Calendar.YEAR);
        int month_born = birthday.get(Calendar.MONTH);
        int day_born = birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("Born in " + (month_born+1) + "/" + day_born + "/" + year_born);
        
        
        Calendar now = Calendar.getInstance();
        int current_year = now.get(Calendar.YEAR);
        age = current_year - year_born;
        
    }
}
