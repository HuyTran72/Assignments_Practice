import java.util.Scanner;

public class assign_21 {
    public static void main(String[] args) {
        String a = "abcdefghijklmnwxyz";
        String b = "zxcegfgtbhnklaiqfo";
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an text: ");
        String input = sc.nextLine();

        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // find the index of character in string a
            int index = a.indexOf(c);
            //If the char is not in String a --> add to output
            if(index==-1) {
                output+=c;
            } else {
                output+= b.charAt(index);
            }
        }
        //print the result
        System.out.println("The text is: "+ output);
    }
}
