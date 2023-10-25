public class assign_20 {
    public static void main(String[] args) {
        boolean result = checkpass("16aA");
        if(result) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
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
