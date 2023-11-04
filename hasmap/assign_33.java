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
        String userName = sc.nextLine();
        System.out.print("Input the password: ");
        String pass = sc.nextLine();

        //check
        if(!dic.containsKey(userName)) {
            System.out.println("User doesn't exist");
        } else if (!dic.get(userName).equals(pass)) {
            System.out.println("Password is wrong");
        } else {
            System.out.println("Login succesful");
        }
    }
}
