import java.util.HashMap;
import java.util.Scanner;

public class assign_33 {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<>();
        dic.put("user1", "123456");
        dic.put("user2", "123457");
        dic.put("user3", "123458");
        dic.put("user4", "123459");
        dic.put("user5", "123450");
        dic.put("user6", "123451");
        dic.put("user7", "123452");

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the username: ");
        String user = sc.nextLine();
        System.out.print("Input the password: ");
        String pass = sc.nextLine();

        for(String key: dic.keySet()) {
            if(!key.equals(user)) {
                System.out.println("User does not exist");
                break;
            }
        }

        for(String value: dic.values()) {
            if(value.equals(pass)) {
                System.out.println("Password is wrong");
                break;
            }
        }
    }
}
