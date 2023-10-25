import java.util.Scanner;

public class assign_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";

        while (true) {
            System.out.println("The password has to at least 6 characters, 1 letter, and 1 number");
            System.out.println("Please enter your password: ");
            String newpass = sc.nextLine();

            if(checkpass(newpass)) {
                password = newpass;
                System.out.println("New password has set");
                break;
            } else {
                System.out.println("Invalid password, please enter again");
            }
            
        }

        int count = 0;
        String login = "";
        while (true) {
            System.out.println("Login");
            login = sc.nextLine();

            if(login.equals(password)) {
                System.out.println("Login is successful");
                break;
            }else {
                System.out.println("Invalid password, please try again");
                count++;
            }

            if(count == 5) {
                System.out.println("You are wrong 5 times, your account was locked");
                break;
            }
        }
    }

    public static boolean checkpass(String password) {
        if (password.length() < 6) {
            return false;
        }

        boolean hasLetter = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
                break;
            }      
        }
        if (!hasLetter) {
            return false;
        }


        boolean hasNum = false;
        for(char c: password.toCharArray()) {
            if(Character.isDigit(c)) {
                hasNum = true;
                break;
            } 
        }
        if (!hasNum) {
            return false;
        }

        return true;
    }       
}