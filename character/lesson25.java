import java.util.Scanner;

public class lesson25 {
    public static void main(String[] args) {
        char ch = 'a';
        char ch2 = 66;
        System.out.println(ch2);

        char ch3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input an character: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(0);
        System.out.println("Char: " + ch4);
        
        //compare
        System.out.println(Character.compare('b', 'b'));
        System.out.println(Character.compare('a', 'b'));
        System.out.println(Character.compare('A', 'a'));

    }
}
    
