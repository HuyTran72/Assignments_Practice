import java.util.Calendar;

public class lesson22 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month+1);
        System.out.println(day);

        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, 07);
        cal.set(Calendar.DAY_OF_MONTH, 02);

        int year1 = cal.get(Calendar.YEAR);
        int month1 = cal.get(Calendar.MONTH);
        int day1 = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println("Born in " + month1 + "/" + day1 + "/" + year1);
    }
}
