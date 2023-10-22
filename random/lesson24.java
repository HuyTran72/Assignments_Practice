
import java.util.Random;

public class lesson24 {
    public static void main(String[] args) {
        Random rd = new Random();
        int soNguyen = rd.nextInt(-50, 51);
        System.out.println(soNguyen);
    }
}
