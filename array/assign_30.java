import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assign_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> quest = new ArrayList<>(List.of(
            "2 + 5 + 7 = ", "5*10 = ", "sqrt(16) = ", "12%2 = "));

        ArrayList<Float> result = new ArrayList<>(List.of(14f, 50f,4f,0f));

        for(int i =0; i<quest.size(); i++) {
            System.out.print(quest.get(i));

            Float rlt = sc.nextFloat();
            if(rlt.equals(result.get(i))) {
                System.out.println("The answer is perfect!!!");
            } else {
                System.out.println("Sorry, the answer is wrong. Please answer again: ");
                System.out.println("Sorry, the answer is wrong. The answer is: " + result.get(i));
            }
        }
    }
}
