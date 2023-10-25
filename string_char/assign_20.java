import java.util.Scanner;

public class assign_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";
        while(true) {
            System.out.println("The password has at least 6 character, 1 letter, and 1 number");
            System.out.println("Please set the password: ");
            String newPassword = sc.nextLine();

            if(checkpass(newPassword)) {
                password = newPassword;
                System.out.println("New password has set");
                break;
            } else {
                System.out.println("Invalid password, please set again!");
            }

        }

        // Input the password
        int count = 0;
        String login = "";
        while(true) {
            System.out.println("Please login: ");
            login = sc.nextLine();

            //check same password
            if(login.equals(password)){
                System.out.println("Login succesfully");
                break;
            }else {
                System.out.println("Invalid password, please input again!");
                count++;
            }

            //if count = 5, break
            if(count == 5) {
                System.out.println("You are wrong 5 times, the account was locked!");
                break;
            }
        }

    }

    public static boolean checkpass(String password) {
        if(password.length() < 6) {
            return false;
        }

        boolean hasLetter = false;
        for (char c: password.toCharArray()) {
            if(Character.isLetter(c)) {
                hasLetter = true;
                break;
            }
        }
        if(!hasLetter){
            return false;
        }

        boolean hasNumber = false;
        for(char c : password.toCharArray()) {
            if(Character.isDigit(c)) {
                hasNumber = true;
                break;
            }
        }
        if (!hasNumber) {
            return false;
        }
    return true;
    }
}
